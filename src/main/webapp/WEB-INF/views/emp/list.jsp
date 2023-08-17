
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMP LIST</title>
</head>
<body>
	<h1>EMP LIST</h1>

	<table width="500" border="1">
		<tr>
			<td>EMPNO</td>
			<td>NAME</td>
			<td>HIREDATE</td>
			<td>SALARY</td>
			<td>MANAGER</td>
		</tr>


		<c:forEach var="emp" items="${emps}">
			<tr>
				<td>${emp.empno}</td>
				<td>${emp.ename}</td>
				<td>${emp.hiredate}</td>
				<td>${emp.sal}</td>
				<td>${emp.mgr}</td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>