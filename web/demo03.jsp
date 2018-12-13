<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>

    <script type="text/javascript">
        //1. 创建对象
        function ajaxFunction() {
            var xmlHttp;
            try { // Firefox, Opera 8.0+, Safari
                xmlHttp = new XMLHttpRequest();
            } catch (e) {
                try {// Internet Explorer
                    xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
                } catch (e) {
                    try {
                        xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
                    } catch (e) {
                    }
                }
            }

            return xmlHttp;
        }

        // AJAX脚本执行
        function checkUserName() {
            // 得到输入框的值，发送给Servlet，进行数据库的查询
            var name = document.getElementById("name").value;
            // 创建AJAX实例
            var request = ajaxFunction();

            //注册状态改变监听，获取服务器传送过来的数据
            request.onreadystatechange = function () {
                if (request.readyState == 4 && request.status == 200) {
                    var responseText = request.responseText;
                    // 局部刷新
                    if (responseText == 1) {
                        document.getElementById("span01").innerHTML = "<font color='red'>用户名已存在";
                    } else {
                        document.getElementById("span01").innerHTML = "<font color='red'>用户名可用";
                    }
                }
            }
            request.open("POST", "ServletDemo03", true);
            request.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
            request.send("name=" + name);
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