<%--
  Created by IntelliJ IDEA.
  User: 温黎明
  Date: 2021/9/22
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="col-md-12 column">
        <div class="page-header">
            <h1>
                <small>新增书籍</small>
            </h1>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <div class="form-group">
            <label>书籍名称:</label>
            <input type="text" name="bookName" class="form-control" required>
        </div>

        <div class="form-group">
            <label>作者:</label>
           <input type="text" name="author" class="form-control" required>
        </div>

        <div class="form-group">
        <label>书籍数量:</label>
        <input type="text" name="bookCounts" class="form-control" required>
        </div>

        <div class="form-group">
        <label>书籍详情:</label>
        <input type="text" name="detail" class="form-control" required>
        </div>

        <div class="form-group">
            <input type="submit" value="添加" class="form-control">
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
