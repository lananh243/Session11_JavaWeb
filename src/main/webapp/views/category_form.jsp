<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/23/2025
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Form Category</h2>
    <form:form modelAttribute="categoryDTO" action="add-category" method="post">
        <label for="categoryName">Tên danh mục: </label>
        <form:input path="categoryName" id="categoryName"/>
        <br>
        <form:errors path="categoryName" cssStyle="color: red;"/>
        <br>
        <input type="submit" value="Gửi">
    </form:form>
</body>
</html>
