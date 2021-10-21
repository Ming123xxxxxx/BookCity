<%--
  Created by IntelliJ IDEA.
  User: 温黎明
  Date: 2021/9/21
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <style>
        span{
            width: 180px;
            height: 238px;
            margin:100px auto;
            text-align: center;
            line-height: 38px;
            font-size: 40px;
            color: black;
            list-style: none;
            text-decoration: none;
        }
        span li{
            backgorund:deepskyblue;
            border-radius: 5px;

        }

    </style>
</head>
<body>
<span>
    <li><a href="${pageContext.request.contextPath}/book/allBook">进入</a> </li>

</span>
</body>
</html>
