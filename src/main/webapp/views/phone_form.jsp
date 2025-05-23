<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/23/2025
  Time: 1:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Phone Form</h2>
    <form:form modelAttribute="phoneDTO" action="phone-save" method="post">
        <label for="phone">Số điện thoại: </label>
        <form:input path="phone" id="phone"/>
        <br>
        <form:errors path="phone" cssStyle="color: red;"/>
        <br>
        <input type="submit" value="Gửi">
    </form:form>
</body>
</html>
