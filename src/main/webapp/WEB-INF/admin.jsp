<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/19 0019
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--引入jstl的标签库--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--引入jstl的格式化标签库--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--引入spring的表单标签库--%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>后台管理</title>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <!-- 引入 Bootstrap -->
    <link href="${app}/static/css/bootstrap.css" rel="stylesheet"/>
    <link href="${app}/static/css/animate.css" rel="stylesheet"/>
    <link href="${app}/static/css/font-awesome.css" rel="stylesheet"/>
    <link href="${app}/static/css/custom.css" rel="stylesheet"/>

    <!-- HTML5 Shim 和 Respond.js 用于让 IE8 支持 HTML5元素和媒体查询 -->
    <!-- 注意： 如果通过 file://  引入 Respond.js 文件，则该文件无法起效果 -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js" rel="external nofollow"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js" rel="external nofollow"></script>
    <![endif]-->
</head>
<body>
当前登录用户:${USER_SESSION}
<a href="${app}/user/logout">退出登录</a>
<hr />
<a href="${app}/user/list">用户管理</a>
<a href="${app}/userrest/list">用户管理REST</a>
<hr />
<!-- 模态框 -->
<div class="modal fade" id="addModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">添加新用户</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- 模态框主体 -->
            <div class="modal-body">
                <form method="post" action="${app}/userrest/opt" class="form-horizontal" role="form">
                    <%--input type="hidden" name="_method" value="POST" /--%>
                    <div class="form-group">
                        <label for="usernameAddInput">username:</label>
                        <input type="text" class="form-control" id="usernameAddInput" name="username" placeholder="请输入用户姓名"/>
                    </div>
                    <div id="usernameTips"></div>
                    <div class="form-group">
                        <label for="passwordAddInput">password:</label>
                        <input type="password" class="form-control" id="passwordAddInput" name="password" placeholder="请输入密码">
                    </div>

                    <div class="form-group">
                        <button id="addUserBtn" type="button" class="btn btn-block btn-primary">添加</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>

        </div>
    </div>
</div>

<div class="modal fade" id="updateModal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">修改信息</h4>
                <button type="button" class="close" data-dismiss="modal">&times;</button>
            </div>

            <!-- 模态框主体 -->
            <div class="modal-body">
                <form method="post" action="${app}/userrest/opt" class="form-horizontal" role="form">
                    <input type="hidden" name="_method" value="PUT" />
                    <div class="form-group">
                        <label for="uidUpdateInput">uid:</label>
                        <input type="text" readonly="readonly" class="form-control" id="uidUpdateInput" name="uid"
                               placeholder="uid"/>
                    </div>
                    <div class="form-group">
                        <label for="usernameUpdateInput">姓名username:</label>
                        <input type="text" readonly="readonly" class="form-control" id="usernameUpdateInput" name="username"
                               placeholder="请输入用户姓名"/>
                    </div>
                    <div class="form-group">
                        <label for="passwordUpdateInput">密码password:</label>
                        <input type="password" class="form-control" id="passwordUpdateInput" name="password"
                               placeholder="请输入新密码">
                    </div>

                    <div class="form-group">
                        <button id="updateUserBtn" type="button" class="btn btn-block btn-primary">修改</button>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">关闭</button>
            </div>

        </div>
    </div>
</div>

<form id="searchForm" method="get" action="${app}/userrest/list">
    <select id="ediCList" name="uidCondition">
        <option selected="selected" value="-1">不限uid</option>
    </select>

    <input name="uid" type="text" value="${userCondition.uid}" placeholder="uid"/>
    <input type="text" placeholder="用户姓名" name="username" value="${userCondition.username}"/>
    <input type="date" name="startDate"
           value="<fmt:formatDate value="${userCondition.startDate}" pattern="yyyy-MM-dd"></fmt:formatDate>"/>
    <input type="date" name="endDate"
           value="<fmt:formatDate value="${userCondition.endDate}" pattern="yyyy-MM-dd"></fmt:formatDate>"/>
    <input class="btn btn-primary" type="button" id="searchBtn" value="查询"/>
</form>
<div>
    <!-- 按钮：用于打开模态框 -->
    <button id="openAddModalBtn" type="button" class="btn btn-primary" data-toggle="modal" data-target="#addModal">新增
    </button>
    <input class="btn btn-danger" type="button" id="deletesBtn" value="删除所选"/>
</div>
<table id="userTable" class="table table-striped table-bordered table-hover">
    <thead>
    <tr class="bg-primary text-white">
        <th>
            <input type="checkbox" id="choiceToggle"/>
            <input class="btn btn-sm btn-warning" type="button" id="reverseBtn" value="反选"/>
        </th>
        <th>序号#</th>
        <th>用户id(uid)</th>
        <th>姓名(username)</th>
        <th>密码(password)</th>
        <th>创建时间(addTime)</th>
        <th>操作(修改)</th>
        <th>操作(删除)</th>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>
<div class="row">
    <div id="pageList" class="col-12 col-md-8">

    </div>
    <div id="pageTips" class="col-12 col-md-4">

    </div>
</div>
<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="${app}/static/js/jquery-3.3.1.js" ></script>
<!-- 包括所有已编译的插件 -->
<script src="${app}/static/js/bootstrap.js"></script>
<script src="${app}/static/js/vue.js"></script>
<script src="${app}/static/js/vue-resources.js"></script>
<script src="${app}/static/js/vue-router.js"></script>
<script src="${app}/static/js/axios.js"></script>
<script src="${app}/static/js/custom.js"></script>
<script>
    $(function () {
        //页面加载时向远端获取所有数据,页面定位在第1页
        // gotoPage(1,3);
        gotoPage();
        //填充下拉列表
        fillSelectList()
        //页面加载时给全选和反选按钮绑定事件
        mulCheck();
        //给查询按钮绑定事件
        $("#searchBtn").click(search);
        //给删除多条记录的按钮绑定事件
        $("#deletesBtn").click(deleteMuliRecord);
        //给添加按钮绑定事件
        $("#openAddModalBtn").click(addForm);
        //点击添加按钮将新增数据存放到数据库
        $("#addUserBtn").click(addUser);
        //给每条记录的修改按钮添加事件
        $(document).on("click", ".upBtn", updateForm);
        //给修改用户信息的按钮添加事件
        $("#updateUserBtn").click(updateUser);
        //给每条记录的删除按钮添加事件
        $(document).on("click", ".delBtn", deleteSingleRecord);
    });

    //修改信息时从远端获取数据并填入表单
    function updateForm(ele) {
        //打开模态框
        $("#updateModal").modal({backdrop: "static"});
        //将表单中原有数据清空
        $("#updateModal form").get(0).reset();
        //从服务器获取信息填入修改表单中
        $.ajax({
            url: ele.target.href,
            type: "GET",
            success: function (result) {
                $("#uidUpdateInput").val(result.dataZone.user.uid);
                $("#usernameUpdateInput").val(result.dataZone.user.username);
                $("#addTimeUpdateInput").val(new Date(result.dataZone.user.addTime).Format("yyyy-MM-dd"));

            },
            error: function () {
            }
        });

        return false;//取消超链接的默认跳转
    }
    function search(){
        //修改数据之前先进行数据校验
        //校验通过向服务器发送请求
        $.ajax({
            url: "${app}/userrest/list",
            type: "GET",
            data: $("#searchForm").serialize(),
            success: function (result) {
                alert(result.message);
                gotoPage();//回到第一页
            },
            error: function (result) {
                alert(result.message);
                return false;
            }
        });
    }
    //提交用户修改的信息
    function updateUser(){
        //修改数据之前先进行数据校验
        //校验通过向服务器发送请求
        $.ajax({
            url: "${app}/userrest/opt",
            type: "PUT",
            data: $("#updateModal form").serialize(),
            success: function (result) {
                alert(result.message);
                $("#updateModal").modal("hide");//关闭模态框
                gotoPage();//回到当前页面
            },
            error: function (result) {
                alert(result.message);
                return false;
            }
        });
    }
    //打开添加的模态框并清空原有数据
    function addForm() {
        //打开模态框
        $("#addModal").modal({backdrop: "static"});
        //将表单中原有数据清空
        $("#addModal form").get(0).reset();
    }

    function addUser() {
        //添加数据之前先进行数据校验
        //校验通过向服务器发送请求
        $.ajax({
            url: "${app}/userrest/opt",
            type: "POST",
            data: $("#addModal form").serialize(),
            success: function (result) {
                alert(result.message);
                $("#addModal").modal("hide");//关闭模态框
                gotoPage(99999);//到最后一页,稍等再改
            },
            error: function (result) {
                alert(result.message);
                return false;
            }
        });
    }

    function deleteSingleRecord(ele){
        //询问是否删除
        if(!confirm("真的删除"))
            return false;
        $.ajax({
            url: ele.target.href,
            type: "DELETE",
            success: function (result) {
                alert(result.message);
                alert(result.dataZone.num);
                gotoPage();
            },
            error: function (result) {
                alert(result.message);
            }
        });
        return false;
    }

    function deleteMuliRecord() {
        //点击删除所选按钮时删除多条记录

        var uids = "";//需要传递给服务器的uid列表
        var usernames = "";//需要显式给操作者看的提示信息列表
        $("[name=choiceList]:checkbox").each(function () {
            if (this.checked) {
                uids += $(this).parents("tr").find("td:eq(0)").text() + "-";//通过 - 连接
                usernames += $(this).parents("tr").find("td:eq(1)").text() + ",";//通过 , 连接
            }
        });
        uids = uids.substr(0, uids.length - 1);//去掉最后的一个 -
        usernames = usernames.substr(0, usernames.length - 1);//去掉最后的一个 ,
        //询问用户操作
        if (confirm("是否删除username为" + uids + "的记录")) {
            // if(confirm("是否删除uid为"+uids+"的记录")){
            //向服务器发送请求,我们已经使用过get和post方法,这次使用最底层的ajax方法
            $.ajax({
                type: "DELETE",
                url: "${app}/userrest/opt/" + uids,
                success: function (result) {
                    alert(result);
                    // $(document).flush();//刷新当前页
                    window.location.reload();
                },
                error: function () {

                }
            });
        }
    }

    function gotoPage(page, pageSize) {
        var page1 = page == null ? 1 : page;
        var pageSize1 = pageSize == null ? 10 : page;
        $.ajax({
            type: "GET",
            url: "${app}/userrest/list",
            dataType: "json",
            data: "pageNum=" + page1 + "&pageSize=" + pageSize1,
            success: function (result) {
                // 解析返回的json数据并显示到界面中,封装为函数吧,太多东西了
                parseDataAndShow(result);
                //解析渲染分页条
                parsePageAndShow(result);
            },
            error: function () {
                alert("数据出错,请调试程序");
            }
        });
    }

    function parseDataAndShow(result) {
        $("#userTable tbody").empty();
        // 获取数据集合
        let users = result.dataZone.pageInfo.list;
        $.each(users, function (index, item) {
            //构建行
            var uTr = $("<tr></tr>");
            //构建多个单元格
            var checkboxTh = $('<th><input type="checkbox" name="choiceList" value="${item.uid}"/></th>');
            var countTh = $('<th></th>').text(index + 1);
            var uidTd = $('<td></td>').text(item.uid);
            var usernameTd = $('<td></td>').text(item.username);
            var passwordTd = $('<td></td>').text(item.password);
            var addTimeTd = $('<td></td>').text(new Date(item.addTime).Format("yyyy-MM-dd HH:mm:ss"));
            var upBtnTd = $('<td></td>').html('<a class="upBtn btn btn-info btn-sm" href="${app}/userrest/opt/' + item.uid + '">修改</a>');
            var delBtnTd = $('<td></td>').html('<a class="delBtn btn btn-danger btn-sm" href="${app}/userrest/opt/' + item.uid + '">删除</a>');
            //将单元格追加到行中
            uTr.append(checkboxTh).append(countTh).append(uidTd)
                .append(usernameTd).append(passwordTd).append(addTimeTd)
                .append(upBtnTd).append(delBtnTd);
            // 将行追加到表体中
            $("#userTable tbody").append(uTr);
        });
    }

    function parsePageAndShow(result) {
        //因为是不跨页面的刷新操作,所以操作前先清空当前节点内容
        $("#pageTips").empty();
        $("#pageList").empty();

        var pageInfo = result.dataZone.pageInfo;
        //构建分页信息
        $("#pageTips").html("共" + pageInfo.total + "条记录," + pageInfo.pages + "页,每页" + pageInfo.pageSize + "条");
        //构建分页列表
        var oUl = $("<ul></ul>").addClass("pagination");
        var firstLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("首页").addClass("page-link").attr("href", "#"));
        var preLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("上一页").addClass("page-link").attr("href", "#"));
        if (pageInfo.isFirstPage) {
            firstLi.addClass("disabled");
            preLi.addClass("disabled");
        }
        oUl.append(firstLi).append(preLi);

        $.each(pageInfo.navigatepageNums, function (index, item) {
            var numLi = $("<li></li>").addClass("page-item").append($("<a></a>").text(item).addClass("page-link").attr("href", "#"));
            if (pageInfo.pageNum == item)
                numLi.addClass("active");
            //给页码绑定点击事件,能够跳转页面
            numLi.click(function () {
                gotoPage(item);//跳转到指定页面
            });

            numLi.appendTo(oUl);
        });

        var lastLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("尾页").addClass("page-link").attr("href", "#"));
        var nextLi = $("<li></li>").addClass("page-item").append($("<a></a>").text("下一页").addClass("page-link").attr("href", "#"));
        if (pageInfo.isLastPage) {
            nextLi.addClass("disabled");
            lastLi.addClass("disabled");
        }
        //给其他页码标签绑定事件
        firstLi.click(function () {
            gotoPage(1)
        });
        preLi.click(function () {
            gotoPage(pageInfo.pageNum - 1)
        });
        nextLi.click(function () {
            gotoPage(pageInfo.pageNum + 1)
        });
        lastLi.click(function () {
            gotoPage(pageInfo.pages + 1)
        });//因为设置了分页插件的合理化配置,所以给一个很大的值就会到最后一页
        oUl.append(nextLi).append(lastLi);

        $("#pageList").append(oUl);

        //解除不能点击按钮的事件
        //分页代码中的部分属性点击失去链接属性,因为这是dom刷新后添加的事件,所以取消默认行为已经不好用了
        $(".pagination .disabled,.pagination .active").off("click");

    }

    function mulCheck() {
        //全选和反选的操作
        $("#choiceToggle").click(function () {
            $("[name=choiceList]:checkbox").prop("checked", this.checked);
        });

        //选中所有子项全选被选中
        //因为通过ajax动态生成该复选框组件,所以以前写的绑定代码不能使用
        //通过dom加载的元素绑定事件使用on方法,不了解看第2天的视频
        $(document).on("click", function () {
            var flag = true;
            $("[name=choiceList]:checkbox").each(function () {
                if (!this.checked) {
                    flag = false;
                }
            });
            $("#choiceToggle").prop("checked", flag);
        });
        // $("[name=choiceList]:checkbox").click(function () {
        //     var flag = true;
        //     $("[name=choiceList]:checkbox").each(function () {
        //         if (!this.checked) {
        //             flag = false;
        //         }
        //     });
        //     $("#choiceToggle").prop("checked", flag);
        // });
        //反选操作
        $("#reverseBtn").click(function () {
            $("[name=choiceList]:checkbox").each(function () {
                this.checked = !this.checked;
            });
        });
    }

    //填充查询条件和部门列表的列表值
    function fillSelectList() {
        //页面加载时获取查询条件中所有的列表并填充到下拉列表中
        $.post(
            "${app}/userType/getTypes",
            function (types) {
                //处理返回的数据
                for (var i = 0; i < types.length; i++) {
                    if (types[i].tid == "${userCondition.ftid}")
                        $("[data-list=typeList]").append("<option selected='selected' value='" + types[i].tid + "'>" + types[i].tname + "</option>");
                    else
                        $("[data-list=typeList]").append("<option  value='" + types[i].tid + "'>" + types[i].tname + "</option>");
                }
            }
        );

        //页面加载时获取查询条件中的uid前缀表达式填充到下拉列表中
        var uidCd = ["大于", "等于", "小于"];
        for (var i = 0; i < 3; i++) {
            if (i == Number.parseInt("${userCondition.uidCondition}"))
                $("#udiCList").append("<option selected='selected' value='" + i + "'>" + uidCd[i] + "</option>");
            else
                $("#udiCList").append("<option  value='" + i + "'>" + uidCd[i] + "</option>");
        }
    }

    //日期转换
    Date.prototype.Format = function (fmt) { // author: meizz
        var o = {
            "M+": this.getMonth() + 1, // 月份
            "d+": this.getDate(), // 日
            "H+": this.getHours(), // 小时
            "m+": this.getMinutes(), // 分
            "s+": this.getSeconds(), // 秒
            "q+": Math.floor((this.getMonth() + 3) / 3), // 季度
            "S": this.getMilliseconds()
            // 毫秒
        };
        if (/(y+)/.test(fmt))
            fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
                .substr(4 - RegExp.$1.length));
        for (var k in o)
            if (new RegExp("(" + k + ")").test(fmt))
                fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k])
                    : (("00" + o[k]).substr(("" + o[k]).length)));
        return fmt;
    };

    function parseISO8601(dateStringInRange) {
        var isoExp = /^\s*(\d{4})-(\d\d)-(\d\d)\s(\d\d):(\d\d)\s*$/, date = new Date(
            NaN), month, hour, min, parts = isoExp.exec(dateStringInRange);

        if (parts) {
            month = +parts[2];
            hour = +parts[4];
            min = +parts[5];
            date.setFullYear(parts[1], month - 1, parts[3]);
            date.setHours(hour, min, 0, 0);
            if (month != date.getMonth() + 1) {
                date.setTime(NaN);
            }
        }
        return date;
    }

    function isValidDate(d) {
        if (Object.prototype.toString.call(d) !== "[object Date]")
            return false;
        return !isNaN(d.getTime());
    }
</script>

</body>
</html>
