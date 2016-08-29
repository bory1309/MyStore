<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin FirstName Page</title>
</head>
<body>
	<p>this is admin FirstName Page</p>
	<a href="/">Return To Index Page</a>
	<table>
		<tr>
			<th>Таблиця імен</th>
		</tr>
		<c:forEach items="${first_names}" var="first_name">
			<tr>
				<th>ID</th>
				<td>${first_name.id}</td>
				<th>Імя</th>
				<td>${first_name.name}</td>
				<td>
					<a href="/admin/first_name/delete/${first_name.id}">Видалити</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<h4>Додати імя</h4>
	<form action="/admin/first_name/save" method="post">
		<table>
			<tr>
				<td><input name="name" placeholder="Додати імя"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Додати"></td>
			</tr>
		</table>
	</form>
</body>
</html>