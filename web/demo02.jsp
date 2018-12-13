<%--
  Created by IntelliJ IDEA.
  User: 西邮陈冠希
  Date: 2018/12/13
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
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

        // 执行get请求
        function get() {
            //1. 创建xmlhttprequest 对象
            var request = ajaxFunction();
            //2. 发送请求。
            request.open("POST", "ServletDemo01", true);
            //3. 获取响应数据 注册监听的意思。  一会准备的状态发生了改变，那么就执行 = 号右边的方法
            request.onreadystatechange = function () {
                //前半段表示 已经能够正常处理。  再判断状态码是否是200
                if (request.readyState == 4 && request.status == 200) {
                    //弹出响应的信息
                    alert("post:" + request.responseText);
                }
            }

            //如果使用的是post方式带数据，那么 这里要添加头， 说明提交的数据类型是一个经过url编码的form表单数据
            request.setRequestHeader("Content-type","application/x-www-form-urlencoded");

            //带数据过去  ， 在send方法里面写表单数据。
            request.send("name=ycy&age=20");
        }
    </script>
</head>
<body>
<h3><a href="" onclick="get()">使用Ajax方式发送Post请求</a></h3>
</body>
</html>
