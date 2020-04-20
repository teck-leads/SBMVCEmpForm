<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="emps" method="post">
		<table>
		<tr>
				<td>Employee Number</td>

				<td><input type="number" name="id"></td>
			</tr>
			<tr>
				<td>Employee Name</td>

				<td><input type="text" name="name"></td>
			</tr>
			
			<tr>
				<td>Employee Designation</td>

				<td><input type="text" name="job"></td>
			</tr>
			<tr>
				<td>Employee Salary</td>

				<td><input type="number" name="salary"></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="Search Employees"></td>
			</tr>


		</table>

	</form>
	


</body>
</html>