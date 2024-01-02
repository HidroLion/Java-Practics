<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrarse</title>
</head>
<body>
	<div class="registerForm">
		<h2>Registrarse</h2>
		<form:form accept-charset="UTF-8" action="/registration" method="post"
			modelAttribute="user">

			<p>
				<form:label path="first_name">Nombre:</form:label>
				<form:input path="first_name" />
				<form:errors path="first_name" />
			</p>
			<p>
				<form:label path="last_name">Apellido:</form:label>
				<form:input path="last_name" />
				<form:errors path="last_name" />
			</p>
			<p>
				<form:label path="email">Email:</form:label>
				<form:input path="email" />
				<form:errors path="email" />
			</p>
			<p>
				<form:label path="password">Contraseña:</form:label>
				<form:input type="password" path="password" />
				<form:errors path="password" />
			</p>
			<p>
				<form:label path="passwordConfirmation">Confirmar contraseña:</form:label>
				<form:input type="password" path="passwordConfirmation" />
				<form:errors path="passwordConfirmation" />
			</p>
			<input type="submit" value="Register" />
		</form:form>
	</div>

</body>
</html>