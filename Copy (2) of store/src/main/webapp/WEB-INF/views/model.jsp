<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Model Page</title>
</head>
<body>
	<p>this is admin Model Page</p>
	<a href="/">Return To Index Page</a>
	<table>
		<tr>
			<th>Перелік усіх моделей</th>
		</tr>
		<c:forEach items="${models}" var="model">
			<tr>
				<th>ID</th>
				<td>${model.id}</td>
				<th>Модель</th>
				<td>${model.name}</td>
				<td>
					<a href="/adminShoes/model/delete/${model.id}">Видалити</a>
				</td>
			</tr>	
		</c:forEach>
	</table>
	
	<form action="/adminShoes/model/save" method="post">
		<table>
			<tr>
				<td><input name="name" placeholder="Вкажіть модель"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Додати"></td>
			</tr>
		
		</table>
	</form>

</body>
</html>