<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/23/2025
  Time: 1:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Product Form</h2>
    <form:form modelAttribute="productDTO" action="product-save" method="post">
        <label for="name">Tên sản phẩm: </label>
        <form:input path="name" id="name"/>
        <br>
        <form:errors path="name" cssStyle="color: red;"/>
        <br>

        <label for="email">Email: </label>
        <form:input path="email" id="email"/>
        <br>
        <form:errors path="email" cssStyle="color: red"/>
        <br>

        <label for="evaluate">Đánh giá: </label>
        <form:input path="evaluate" id="evaluate"/>
        <br>
        <form:errors path="evaluate" cssStyle="color: red"/>
        <br>

        <label for="comment">Bình luận: </label>
        <form:input path="comment" id="comment"/>
        <br>
        <form:errors path="comment" cssStyle="color: red"/>
        <br>

        <input type="submit" value="Gửi">
    </form:form>
</body>
</html>
