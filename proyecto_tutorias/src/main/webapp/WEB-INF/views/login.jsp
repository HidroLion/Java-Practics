<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Iniciar sesion</title>
</head>
<body>
	<div>
		<h1>Iniciar sesion</h1>
		<form method="post" action="/login">
			<p>
				<label for="email">Email:</label> <input type="text" id="email"
					name="email" />
			</p>
			<p>
				<label for="password">Contraseña:</label> <input type="password"
					id="password" name="password" />
			</p>
			<input type="submit" value="Login" />
		</form>
		<p>
			<c:out value="${error}" />
		</p>
	</div>
</body>
</html>