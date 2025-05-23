<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/19/2025
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Movie Form</h3>
    <form:form modelAttribute="movieDTO" action="movie-save" method="post">
        <label for="title">Title</label>
        <form:input path="title" id="title" />
        <br>
        <form:errors path="title" cssStyle="color: red"/>
        <br>


        <label for="email">Email</label>
        <form:input path="email" id="email" type="email" />
        <br>
        <form:errors path="email" cssStyle="color: red;" />
        <br>

        <label for="quantity">Quantity</label>
        <form:input path="quantity" id="quantity" type="number" />
        <br>
        <form:errors path="quantity" cssStyle="color: red;" />
        <br>

        <label for="birthday">Birthday</label>
        <form:input path="birthday" id="birthday" type="date" />
        <br>
        <form:errors path="birthday" cssStyle="color: red;" />
        <br>

        <label for="eventDate">EventDate</label>
        <form:input path="eventDate" id="eventDate" type="date" />
        <br>
        <form:errors path="eventDate" cssStyle="color: red;" />
        <br>

        <input type="submit" value="Gửi" />
    </form:form>
</body>
</html>
