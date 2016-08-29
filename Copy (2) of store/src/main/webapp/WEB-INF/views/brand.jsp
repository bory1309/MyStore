<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Brand Page</title>
</head>
<body>
	<p>this is admin Brand Page</p>
	<a href="/">Return To Index Page</a>
	
	<table>
		<tr>
			<th>Перелік усіх брендів</th>
		</tr>
		<c:forEach items="${brands}" var="brand">
			<tr>
				<th>ID</th>
				<td>${brand.id}</td>
				<th>Бренд</th>
				<td>${brand.name}</td>
				<td>
					<a href="/adminShoes/brand/delete/${brand.id}">Видалити</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<form action="/adminShoes/brand/save" method="post">
		<table>
			<tr>
				<td><input name="name" placeholder="Додати бренд"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Додати"></td>
			</tr>
		</table>
	</form>

</body>
</html>