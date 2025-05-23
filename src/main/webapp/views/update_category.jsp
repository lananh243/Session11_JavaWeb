<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Sửa Danh Mục</title>
</head>
<body>
<h1>Sửa Danh Mục</h1>
<form action="update-category" method="post">
  <input type="hidden" name="id" value="${category.id}" />

  <label for="categoryName">Tên Danh Mục:</label>
  <input type="text" id="categoryName" name="categoryName" value="${category.categoryName}" required />

  <label for="status">Trạng Thái:</label>
  <select id="status" name="status">
    <option value="true" <c:if test="${category.status}">selected</c:if>>Kích hoạt</option>
    <option value="false" <c:if test="${!category.status}">selected</c:if>>Không kích hoạt</option>
  </select>

  <button type="submit">Cập Nhật</button>
  <a href="categories">Quay lại</a>
</form>
</body>
</html>