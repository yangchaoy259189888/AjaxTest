<%--
  Created by IntelliJ IDEA.
  User: 西邮陈冠希
  Date: 2018/12/14
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="jquery-3.2.1/jquery-3.2.1.js"></script>

    <script type="text/javascript">
        function load() {
            // 找到这个元素， 去执行加载的动作， 加载ServletDemo04， 得到的数据，赋值显示
            $("#aaa").load("ServletDemo04", function (responseText, statusTXT, xhr) {
                $("#aaa").val(responseText);
            })
        }
    </script>
</head>
<body>
<h3><input type="button" onclick="load()" value="使用JQuery执行load方法"></h3>
<input type="text" id="aaa">
</body>
</html>
