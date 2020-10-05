<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.darwinjacob.util.Mappings" %>

<head>
    <meta charset="UTF-8">
    <title>View Item</title>
</head>
<body>
    <div align="center">
    <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
    <a href="${addUrl}">New Item</a>

        <table border="1" cellpadding="5">
            <caption><h2>Todo Items</h2></caption>

            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Deadline</th>
                <th>Details</th>
            </tr>

            <tr>
                <td>${todoItem.id}</td>
                <td>${todoItem.title}</td>
                <td>${todoItem.deadLine}</td>
                <td>${todoItem.details}</td>
            </tr>

        </table>
        <div align="center">
              <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
              <a href="${itemsLink}">Items List</a>
        </div>
    </div>
</body>
</html>