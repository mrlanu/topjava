<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/sandstone/bootstrap.min.css">

    <title>Title</title>
</head>
<body>
<div class="container mySpace">
    <div class="card">
        <div class="card card-body">
            <table id="meals" class="table table-hover table-striped">
                <tr>
                    <th>Date/Time</th>
                    <th>Description</th>
                    <th>Calories</th>
                </tr>

                <c:forEach items="${mealList}" var="meal">
                    <tr class="${meal.exceed ? 'table-danger' : 'table-success'}">
                        <td>${meal.dateTime}</td>
                        <td>${meal.description}</td>
                        <td>${meal.calories}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

<script type="text/javascript" src="/webjars/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript" src="/webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>