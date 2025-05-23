<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lan Anh
  Date: 5/23/2025
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Thên mới danh mục thành công</h1>
    <table border="1">
        <thead>
        <tr>
            <th>ID</th>
            <th>CategoryName</th>
            <th>Status</th>
            <th>Hành động</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="category" items="${categoryList}">
            <tr>
                <td>${category.id}</td>
                <td>${category.categoryName}</td>
                <td>${category.status ? 'Kích hoạt' : 'Không kích hoạt'}</td>
                <td>
                    <form action="edit-category/${category.id}" method="get">
                        <button type="submit">Sửa</button>
                    </form>
                    <form action="delete-category/${category.id}" method="post" onsubmit="return confirm('Bạn có chắc chắn muốn xóa danh mục này?');">
                        <button type="submit">Xóa</button>
                    </form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
