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


	<c:choose>



		<c:when test="${ not empty empsObjKey}">
			<table border="1">
				<tr>
					<td>Id</td>

					<td>Name</td>

					<td>Job</td>
					<td>MGR</td>
					<td>Department No</td>
				</tr>

				<c:forEach items="${ empsObjKey}" var="emp">
					<tr>
						<td>${emp.id }</td>

						<td>${emp.name }</td>

						<td>${emp.job }</td>
						<td>${emp.mgr }</td>
						<td>${emp.deptNo }</td>
					</tr>

				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<p>Data is not available</p>


		</c:otherwise>

	</c:choose>







</body>
</html>