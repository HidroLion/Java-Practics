<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <body>
        <p>Tu has vistado a la pagina: 
        	<a href="http://localhost:8080/your-server">localhost:8080/your-server</a>
        </p>
        <p><c:out value="${count}"/> Veces</p>
        <a href="http://localhost:8080/your-server">Prueba otra Visita</a>
    </body>
</html>