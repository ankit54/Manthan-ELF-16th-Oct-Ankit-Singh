<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% EmployeeInfoBeans employeeInfoBeans=(EmployeeInfoBeans) session.getAttribute("employeeInfoBean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello <%= employeeInfoBeans.getEmpName() %></h1>
<a href="./searchEmployeeForm">SEARCH EMPLOYEE</a><br><br>
<a href="./addEmployeeForm">ADD EMPLOYEE</a><br><br>
<a href="./updateEmployeeForm">UPDATE EMPLOYEE</a><br><br>
<a href="./seeAllEmployeeServletJsp">SEE ALL EMPLOYEE</a><br><br>
<a href="./deleteEmployeeForm">DELETE EMPLOYEE</a><br><br><br>
<a href="./logoutEmployeeJsp">LOGOUT EMPLOYEE</a><br><br>
</body>
</html>