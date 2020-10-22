# 首先创建一个数据库(Tab补全)
drop database if exists ele;
create database if not exists ele;

# 手动提交
commit ;

use ele;

# 创建用户表
drop table if exists user;
create table if not exists user(
                                   uid integer auto_increment comment '用户id',
                                   username varchar(20) not null comment '用户登录名',
                                   password varchar(32) not null comment '登录密码',
                                   primary key (`uid`)
)comment '管理用户登录表';

commit ;
# 插入测试数据
insert into user (username, password) values ('wzf','696aa7bb5ee7ac9135f7ed4ef526fe4d');
insert into user (uid, username, password) values (null,'zs','696aa7bb5ee7ac9135f7ed4ef526fe4d');

commit ;

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