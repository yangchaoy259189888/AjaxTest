<%--
  Created by IntelliJ IDEA.
  User: 西邮陈冠希
  Date: 2018/12/14
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="jquery-3.2.1/jquery-3.2.1.js"></script>

    <script type="text/javascript">
        function checkUserName() {
            //1. 获取输入框的内容

            //2. 发送请求
            //3. 输出响应的数据到页面上。
            var name = $("#name").val();
            $.post("ServletDemo03", {name: name}, function (data, status) {
                if (data == 1) {
                    $("#span01").html("<font color='red'>用户名已被注册</font>");
                } else {
                    $("#span01").html("<font color='green'>用户名可以使用</font>");
                }
            });
        }
    </script>
</head>
<body>
<table border="1" width="500">
    <tr>
        <td>用户名:</td>
        <td><input type="text" name="name" id="name" onblur="checkUserName()"><span id="span01"></span></td>
    </tr>
    <tr>
        <td>密码</td>
        <td><input type="text" name=""></td>
    </tr>
    <tr>
        <td>邮箱</td>
        <td><input type="text" name=""></td>
    </tr>
    <tr>
        <td>简介</td>
        <td><input type="text" name=""></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="注册"></td>
    </tr>
</table>
</body>
</html>
