<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Street Page</title>
</head>
<body>
	<p>this is admin Street Page</p>
	<a href="/">Return To Index Page</a>
	<table>
		<tr>
			<th>Перелік усіх вулиць</th>
		</tr>
		<c:forEach items="${streets}" var="street">
			<tr>
				<th>ID</th>
				<td>${street.id}</td>
				<th>Назва вулиці</th>
				<td>${street.name}</td>
				<td><a href="/admin/street/delete/${street.id}">Видалити</a></td>
			</tr>
		</c:forEach>
	</table>

	<h4>Додати населений пункт</h4>
	<form action="/admin/street/save" method="post">
		<table>
			<tr>
				<td><input name="name" placeholder="Додати населений пункт"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Додати"></td>
			</tr>
		</table>
	</form>
	
</body>
</html>