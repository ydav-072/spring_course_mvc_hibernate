<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Employee info</h2>
    <br>
    <form:form action="saveEmployee" modelAttribute="employee">

        <form:hidden path="id"></form:hidden>
        Name <form:input path="name"></form:input>
        <br><br>
        Surname <form:input path="surname"></form:input>
        <br><br>
        Department <form:input path="department"></form:input>
        <br><br>
        Salary <form:input path="salary"></form:input>
        <br><br>
        <input type="submit" value="OK">
    </form:form>
</body>
</html>
