<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin Person Page</title>
</head>
<body>
	<p>this is admin Person Page</p>
	<a href="/">Return To Index Page</a>
	
	
	<form action="/admin/person" method="post">
		<table>
		
			<tr>
				<td>Виберіть імя</td>
				<td>
					<select name="first_nameId">
						<c:forEach items="${first_names}" var="first_name">
							<option value="${first_name.id}">
								${first_name.name}
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>Виберіть прізвище</td>
				<td>
					<select name="last_nameId">
						<c:forEach items="${last_names}" var="last_name">
							<option value="${last_name.id}">
								${last_name.name}
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
			<td>Вкажіть вік особи</td>
				<td><input name="age" placeholder="Вказати вік"></td>
			</tr>
		
			<tr>
				<td>Виберіть населений пункт</td>
				<td>
				
					<select name="cityId">
						<c:forEach items="${cities}" var="city">
							<option value="${city.id}">
								${city.name}
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>Виберіть вулицю</td>
				<td>
					<select name="streetId">
						<c:forEach items="${streets}" var="street">
							<option value="${street.id}">
								${street.name}
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td>Вкажіть номер будинку</td>
				<td><input name="building" placeholder="Вказати номер будинку"></td>
			</tr>
			
			<tr>
				<td>Виберіть електронну адресу</td>
				<td>
					<select name="emailId">
						<c:forEach items="${emails}" var="email">
							<option value="${email.id}">
								${email.name}
							</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			
			<tr>
				<td><input type="submit" value="Додати"></td>
			</tr>
		</table>
	</form>
	
	<table>
		<tr>
			<th>Список осіб</th>
		</tr>
		<c:forEach items="${persons}" var="person">
		<tr>
			<th>ID</th>
			<td>${person.id}</td>
			<th>Імя</th>
			<td>${person.first_name.name}</td>
			<th>Прізвище</th>
			<td>${person.last_name.name}</td>
			<th>Вік</th>
			<td>${person.age}</td>
			<th>Нас.пункт</th>
			<td>${person.city.name}</td>
			<th>Вулиця</th>
			<td>${person.street.name}</td>
			<th>Будинок</th>
			<td>${person.building}</td>
			<th>Ел.адреса</th>
			<td>${person.email.name}</td>
			<td><a href="/admin/person/delete/${person.id}">Видалити</a></td>	
		</tr>
		</c:forEach>
	</table>
</body>
</html>