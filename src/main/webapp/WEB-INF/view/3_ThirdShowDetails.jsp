<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 07.07.2024
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Dear employee you are welcome!!!</h2>
    <br>
    <br>
    your name is ${employee.name}
    <br>
    <br>
    your surname is ${employee.surname}
    <br>
    <br>
    your salary is ${employee.salary}
    <br>
    <br>
    your department is ${employee.department}
    <br>
    <br>
    your car is ${employee.carBrand}
    <br>
    <br>
    Language(s):
<ul>
    <c:forEach var="language" items="${employee.languages}">
        <li>${language}</li>
    </c:forEach>
</ul>
    <br>
    <br>
    your email is ${employee.email}
</body>
</html>
