<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/22/2025
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>User Form</h3>
<form:form modelAttribute="userDTO" action="user-save" method="post">
    <label for="name">Tên người dùng: </label>
    <form:input path="name" id="name"/>
    <br>
    <form:errors path="name" cssStyle="color: red"/>
    <br>

    <label for="email">Email: </label>
    <form:input path="email" id="email"/>
    <br>
    <form:errors path="email" cssStyle="color: red"/>
    <br>

    <label for="phone">Số điện thoại: </label>
    <form:input path="phone" id="phone"/>
    <br>
    <form:errors path="phone" cssStyle="color: red"/>
    <br>

    <label for="password">Mật khẩu: </label>
    <form:input path="password" id="password"/>
    <br>
    <form:errors path="password" cssStyle="color: red"/>
    <br>

    <label for="status">Trạng thái: </label>
    <form:input path="status" id="status"/>
    <br>
    <form:errors path="status" cssStyle="color: red"/>
    <br>

    <input type="submit" value="Gửi">
</form:form>
</body>
</html>
