<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Season Page</title>
</head>
<body>
	<p>this is admin Season Page</p>
	<a href="/">Return To Index Page</a>
	<table>
		<tr>
			<th>Перелік усіх сезонів</th>
		</tr>
		<c:forEach items="${seasons}" var="season">
		<tr>
			<th>ID</th>
			<td>${season.id}</td>
			<th>Сезон</th>
			<td>${season.name}</td>
			<td>
				<a href="/adminShoes/season/delete/${season.id}">Видалити</a>
			</td>
		</tr>
		</c:forEach>
	</table>
	
	<form action="/adminShoes/season/save" method="post">
		<table>
			<tr>
				<td>
					<input name="name" placeholder="Введіть сезон">
				</td>
				<td>
					<input type="submit" value="Додати">
				</td>
			</tr>
			
		
		</table>
	</form>

</body>
</html>