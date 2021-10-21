<%--
  Created by IntelliJ IDEA.
  User: 温黎明
  Date: 2021/9/22
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">

    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>ID查询</small>
            </h1>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/queryById" method="post">
        <div class="form-group">
            <label>书籍编号:</label>
            <input type="text" name="bookID" class="form-control" required>
        </div>
        <div class="form-group">
            <input type="submit" value="ID查询" class="form-control">
        </div>
    </form>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allBook">书籍列表</a>
        </div>
    </div>
</div>
</body>
</html>
