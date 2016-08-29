<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin City Page</title>
</head>
<body>
	<p>this is admin City Page</p>
	<a href="/">Return To Index Page</a>
	<table>
		<tr>
			<th>Перелік усіх населених пунктів</th>
		</tr>
		<c:forEach items="${cities}" var="city">
			<tr>
				<th>ID</th>
				<td>${city.id}</td>
				<th>Населений пункт</th>
				<td>${city.name}</td>
				<td><a href="/admin/city/delete/${city.id}">Видалити</a></td>
			</tr>
		</c:forEach>
	</table>

	<h4>Додати населений пункт</h4>
	<form action="/admin/city/save" method="post">
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