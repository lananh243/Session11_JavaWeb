<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/23/2025
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <h1>Đăng Ký Người Dùng</h1>
  <form:form modelAttribute="registrationDTO" action="save-register" method="post">

    <label for="name">Tên:</label>
    <form:input path="name" id="name"/>
    <form:errors path="name" cssClass="error" /><br/>

    <label for="email">Email:</label>
    <form:input path="email" id="email"/>
    <form:errors path="email" cssClass="error" /><br/>

    <label>Vai trò:</label>
    <form:radiobutton path="role" value="user" id="roleUser"/> Người Dùng
    <form:radiobutton path="role" value="admin" id="roleAdmin"/> Admin
    <form:errors path="role" cssClass="error" /><br/>

    <div id="adminCodeDiv" style="display:none;">
      <label for="adminCode">Mã Admin:</label>
      <form:input path="adminCode" id="adminCode"/>
      <form:errors path="adminCode" cssClass="error" /><br/>
    </div>

    <input type="submit" value="Đăng ký" />
  </form:form>

  <script>
    // Hiển thị trường mã admin nếu vai trò chọn là admin
    document.querySelectorAll('input[name="role"]').forEach(function(elem) {
      elem.addEventListener("change", function() {
        document.getElementById("adminCodeDiv").style.display = this.value === "admin" ? "block" : "none";
      });
    });
  </script>
  </body>
</html>
