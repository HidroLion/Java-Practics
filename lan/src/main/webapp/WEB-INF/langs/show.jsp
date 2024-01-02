<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1><c:out value="${lang.name}"/></h1>
	<p>Creador: <c:out value="${lang.creator}"/></p>
	<p>Version Actual: <c:out value="${lang.currentVersion}"/></p>
<a href="/langs/${lang.id}/edit">Editar Lenguaje</a>
<form action="/langs/${lang.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>