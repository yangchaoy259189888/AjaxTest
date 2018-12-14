<%--
  Created by IntelliJ IDEA.
  User: 西邮陈冠希
  Date: 2018/12/15
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="width: 100%">
    <c:forEach items="${list}" var="wordBean">
        <tr>
            <td>${wordBean.words}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
