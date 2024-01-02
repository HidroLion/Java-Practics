<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<h1>Lenguajes</h1>
<table>
    <thead>
        <tr>
            <th>Nombre</th>
            <th>Creador</th>
            <th>Version Actual</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${langs}" var="lang">
            <tr>
                <td><a href="/langs/${lang.id}"><c:out value="${lang.name}"/></a></td>
                <td><c:out value="${lang.creator}"/></td>
                <td><c:out value="${lang.currentVersion}"/></td>
                <td><a href="/langs/${lang.id}/edit">Editar</a></td>
                <td>
                    <a href="/langs/${lang.id}" onclick="event.preventDefault(); document.getElementById('delete-form-${lang.id}').submit();">
                        Eliminar
                    </a>

                    <form id="delete-form-${lang.id}" action="/langs/${lang.id}" method="post" style="display: none;">
                        <input type="hidden" name="_method" value="delete">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<h1>Agregar Lenguaje</h1>
<form:form action="/langs" method="post" modelAttribute="lang">
    <p>
        <form:label path="name">Nombre</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="creator">Creador</form:label>
        <form:errors path="creator"/>
        <form:input path="creator"/>
    </p>
    <p>
        <form:label path="currentVersion">Version</form:label>
        <form:errors path="currentVersion"/>
        <form:input path="currentVersion"/>
    </p>   
    <input type="submit" value="Submit"/>
</form:form>

