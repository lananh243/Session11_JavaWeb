<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/22/2025
  Time: 11:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Form Password</h1>
    <form:form modelAttribute="passwordDTO" action="password-save" method="post">
        <label for="password">Mật khẩu: </label>
        <form:input path="password" id="password"/>
        <br>
        <form:errors path="password" cssStyle="color: red"/>
        <br>
        <input type="submit" value="Gửi">
    </form:form>
</body>
</html>
