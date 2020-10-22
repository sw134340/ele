# 首先创建一个数据库(Tab补全)
drop database if exists ele;
create database if not exists ele;

# 手动提交
commit ;

use ele;

# 创建用户表
drop table if exists adminuser;
create table if not exists adminuser(
                                   uid integer auto_increment comment '用户id',
                                   username varchar(20) not null comment '用户登录名',
                                   password varchar(32) not null comment '登录密码',
                                   add_time timestamp   not null default current_timestamp comment '创建时间',
                                   up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
                                   primary key (`uid`)
)comment '管理用户登录表';

commit ;
# 插入测试数据
insert into adminuser (username, password) values ('wzf','696aa7bb5ee7ac9135f7ed4ef526fe4d');
insert into adminuser (uid, username, password)values (null, 'admin', 'fe8fb64eb34764f9e0a58a32a819dcb2');

# 批量插入测试数据
DROP PROCEDURE
    IF
        EXISTS adminuser_insert;

DELIMITER $$
CREATE PROCEDURE adminuser_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into adminuser (username,password) value (concat('user',i),'fe8fb64eb34764f9e0a58a32a819dcb2') ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL adminuser_insert ();

commit ;

# 创建客户数据表
drop table if exists customer;
create table if not exists customer
(
    cid integer auto_increment comment '客户id',
    cname varchar(20) not null comment '客户姓名',
    cphone varchar(20) default null comment '联系电话',
    cemail varchar(64) default null comment '邮箱地址',
    cpass varchar(32) not null comment '密码',
    cbirth date default null comment '生日',
    cavatar varchar(50) default null comment '头像',
    cgender boolean default false comment '性别',
    cstatus boolean default false comment '是否禁用',
    add_time timestamp   not null default current_timestamp comment '创建时间',
    up_time  timestamp   not null default current_timestamp on update current_timestamp comment '修改时间',
    primary key (`cid`),
    UNIQUE KEY `cid` (`cid`),
    UNIQUE KEY `cname` (`cname`),
    UNIQUE KEY `cphone` (`cphone`),
    UNIQUE KEY `cemail` (`cemail`)
) auto_increment=1 charset=utf8 comment '客户基本信息表';
commit ;

# 通过批处理插入测试数据
DROP PROCEDURE
    IF
        EXISTS customer_insert;

DELIMITER $$
CREATE PROCEDURE customer_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into customer (cname,cpass) value (concat('cus',i),'696aa7bb5ee7ac9135f7ed4ef526fe4d') ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL customer_insert ();


drop table if exists storeinfo;
create table if not exists storeinfo
(
    sid    int          not null comment '商家id'
        primary key,
    sname       varchar(50)  not null comment '商家名称',
    spassword   varchar(32)  not null comment '商家密码',
    sphoto      varchar(128) not null comment '图片',
    marking     varchar(12)  not null comment '评分',
    dispatching varchar(32)  not null comment '配送方式',
    offer       varchar(32)  null comment '推荐字段'
)
    comment '商家信息';



drop table if exists active;
create table if not exists active
(
    aid    int          not null comment '活动id'
        primary key,
    aname  varchar(50)  not null comment '活动名称',
    aintro varchar(128) not null comment '活动简介'
)
    comment '活动';



drop table if exists st_ac;
create table if not exists st_ac
(
    stid int not null comment '商家活动表id'
        primary key,
    fsid int not null comment '商家表的外键',
    faid int not null comment '活动表的外键'
)
    comment '商家活动表';



drop table if exists goods;
create table if not exists goods
(
    gid    int          not null comment '商品id'
        primary key,
    gname  varchar(50)  not null comment '商品名称',
    ginfo  varchar(128) not null comment '商品介绍',
    gphoto varchar(128) not null comment '商品图片',
    gprice double       not null comment '商品价格',
    gtype  varchar(20)  not null comment '商品所属分类'
)
    comment '商品表';


drop table if exists typeofgoods;
create table if not exists typeofgoods
(
    tid   int         not null comment '商品类别id'
        primary key,
    tname varchar(20) not null comment '商品分类名称'
)
    comment '商品类别表';

# 创建订单表
drop table if exists orderlist;
create table if not exists orderlist(
    oid integer auto_increment comment '订单编号',
    ouserid integer default null comment '所属用户',
    goods varchar(50) not null comment '订购产品',
    quantity integer not null comment '产品数量',
    ostoreid integer default null comment '所属商户',
    status boolean default false comment '结算状态未支付',
    add_time timestamp  not null default current_timestamp comment '创建时间',
    up_time  timestamp  not null default current_timestamp on update current_timestamp comment '修改时间',
    constraint `fk_ol_ouserid_to_cus_cid`foreign key orderlist(`ouserid`)references customer(`cid`),
    constraint `fk_ol_ostoreid_to_store_sid`foreign key orderlist(`ostoreid`)references storeinfo(`sid`),
    primary key (`oid`)
)comment '订单表';

commit;
# 批量处理插入订单测试数据
DROP PROCEDURE
    IF
        EXISTS order_insert;

DELIMITER $$
CREATE PROCEDURE order_insert ()
BEGIN
    DECLARE
        i INT DEFAULT 1;
    WHILE
            i < 100 DO
            insert into orderlist (goods,quantity) value (concat('goods',i),1) ;
            SET i = i + 1;

        END WHILE;
    COMMIT;

END $$
DELIMITER ;
CALL order_insert ();

commit;

