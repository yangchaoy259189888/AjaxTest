<%--
  Created by IntelliJ IDEA.
  User: 西邮陈冠希
  Date: 2018/12/14
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <script type="text/javascript" src="jquery-3.2.1/jquery-3.2.1.js"></script>

    <script type="text/javascript">
        function post() {
            $.post("ServletDemo04", {name: "杨朝阳", age: 21}, function (data, status) {
                $("#div01").text(data + status);
            })
        }
    </script>
</head>
<body>
<h3><input type="button" onclick="post()" value="使用JQuery执行post方法"></h3>
<div id="div01" style="width: 100px; height: 100px; border: 1px solid blue; "></div>
</body>
</html>
