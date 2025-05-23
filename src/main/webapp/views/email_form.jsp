<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/22/2025
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Form Email</h1>
    <form:form modelAttribute="emailDTO" action="email-save" method="post">
        <label for="email">Email: </label>
        <form:input path="email" id="email"/>
        <br>
        <form:errors path="email" cssStyle="color: red"/>
        <br>
        <input type="submit" value="Gửi">
    </form:form>
</body>
</html>
