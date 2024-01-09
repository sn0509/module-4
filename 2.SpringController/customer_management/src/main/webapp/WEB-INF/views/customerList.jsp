<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Email</th>
        <th scope="col">Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customers}">
    <tr>
        <th scope="row">${customer.getId()}</th>
        <td>${customer.getName()}</td>
        <td>${customer.getEmail()}</td>
        <td>@${customer.getAddress()}</td>
    </tr>
    </c:forEach>
</table>

</body>
</html>
