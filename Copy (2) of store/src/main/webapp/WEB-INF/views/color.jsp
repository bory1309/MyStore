<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Color Page</title>
</head>
<body>
	<p>this is admin Color Page</p>
	<a href="/">Return To Index Page</a>
	<table>
		<tr>
			<th>Перелік усіх кольорів</th>
		</tr>
		<c:forEach items="${colors}" var="color">
		<tr>
			<th>ID</th>
			<td>${color.id}</td>
			<th>Колір</th>
			<td>${color.name}</td>
			<td>
				<a href="/adminShoes/color/delete/${color.id}">Видалити</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	<form action="/adminShoes/color/save" method="post">
		<table>
			<tr>
				<td><input name="name" placeholder="Введіть колір"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Додати"></td>
			</tr>
		</table>
	</form>

</body>
</html>