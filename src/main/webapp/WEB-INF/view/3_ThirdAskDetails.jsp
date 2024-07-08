<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Professional
  Date: 07.07.2024
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Dear employee please enter your details!</h2>
    <br>
    <br>
    <%--@elvariable id="employee" type=""--%>
    <form:form action="showDetails" modelAttribute="employee">
        Name <form:input path="name"/>
        <form:errors path="name"/>
        <br>
        <br>
        Surname <form:input path="surname"/>
        <form:errors path="surname"/>
        <br>
        <br>
        Salary <form:input path="salary"/>
        <form:errors path="salary"/>
        <br>
        <br>
        Department <form:select path="department">
            <form:option value="Information Technology" label="IT"/>
            <form:option value="Human resources" label="HR"/>
            <form:option value="Sales" label="Sales"/>
     </form:select>

        <br>
        <br>
        Which car do you want?
        BMW <form:radiobutton path="carBrand" value="BMW"/>
        Audi <form:radiobutton path="carBrand" value="Audi"/>
        Kia <form:radiobutton path="carBrand" value="Kia"/>
        <br><br>
        Foreign languages:
        <form:checkboxes path="languages" items="${employee.languagesMap}"/>
        <br>
        <br>
        Email <form:input path="email"/>
        <form:errors path="email"/>
        <br>
        <br>

        <input type="submit" value="Ok">
    </form:form>
</body>
</html>
