<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin LastName Page</title>
</head>
<body>
	<p>this is admin LastName Page</p>
	<a href="/">Return To Index Page</a>
	<table>
		<tr>
			<th>Таблиця прізвищ</th>
		</tr>
		<c:forEach items="${last_names}" var="last_name">
			<tr>
				<th>ID</th>
				<td>${last_name.id}</td>
				<th>Прізвище</th>
				<td>${last_name.name}</td>
				<td>
					<a href="/admin/last_name/delete/${last_name.id}">Видалити</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<h4>Додати прізвище</h4>
	<form action="/admin/last_name/save" method="post">
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