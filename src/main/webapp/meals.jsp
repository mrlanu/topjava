<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table>
    <tr>
        <th>Date/Time</th>
        <th>Description</th>
        <th>Calories</th>
    </tr>

    <c:forEach items="${mealList}" var="meal">
        <tr style="${meal.exceed eq true ? 'background-color: red':'background-color: green'}">
            <td>${meal.dateTime}"</td>
            <td>${meal.description}"</td>
            <td>${meal.calories}"</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>