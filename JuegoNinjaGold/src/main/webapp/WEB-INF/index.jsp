<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    
    <link rel="stylesheet" href="js/css/ninjagold.css">
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!-- <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %> -->
    <title>Index Page</title>
</head>
<body>
    <div class="container">
        <div class="jumbotron">
            <h1>Ninja Gold!</h1>
        </div>
        <div class="score mb-2">
            <h4>Tu Oro: <span><c:out value="${total_gold}"></c:out></span></h4>
        </div>

        <div class="row">
            <div class="place col-md-3 pt-2 pb-4">
                <h3>Granja</h3>
                <p>Gana 10-20 de oro</p>
                <form action="/process_money" method="post">
                    <input type="hidden" name="building" value="farm" />
                    <input type="submit" value="Oro!" />
                </form>
            </div>
            <div class="place col-md-3 pt-2 pb-4">
                <h3>Cueva</h3>
                <p>Gana 5-10 de oro</p>
                <form action="/process_money" method="post">
                    <input type="hidden" name="building" value="cave" />
                    <input type="submit" value="Oro!" />
                </form>
            </div>
            <div class="place col-md-3 pt-2 pb-4">
                <h3>Casa</h3>
                <p>Gana 2-5 de oro</p>
                <form action="/process_money" method="post">
                    <input type="hidden" name="building" value="house" />
                    <input type="submit" value="Oro!" />
                </form>
            </div>
            <div class="place col-md-3 pt-2 pb-4">
                <h3>Casino</h3>
                <p>Gana o Pierde 0-50 de oro</p>
                <form action="/process_money" method="post">
                    <input type="hidden" name="building" value="casino" />
                    <input type="submit" value="Oro!" />
                </form>
            </div>
        </div>
        <div class="row mt-2">
            <h5><u>Historial:</u>:</h5>
            <div class="activities pl-3 mb-2">
                <!-- <p><c:out value="${message}"></c:out></p> -->
                <c:forEach var="activity" items="${activities}">
                    <p style="margin: 0px;"><c:out value="${activity}" /></p>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>