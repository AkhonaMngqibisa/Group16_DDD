<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <%@ page isELIgnored="false" %>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Gym Management</title>
</head>
<body>
<div>
    <div>
        <h2>Gym Details</h2>
        <hr/>
        <a href="/new-gym">
            <button type="submit">Add new book</button>
        </a>
        <br/><br/>
        <div>
            <div>
                <div>Gym list</div>
            </div>
            <div>
                <table>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                    </tr>
                    <c:forEach var="gym" items="${listGym}">
                        <tr>
                            <td>${gym.gymID}</td>
                            <td>${gym.gymName}</td>
                            <td>
                                <a href="/${gym.gymID}">Edit</a>
                                <form action="/${gym.gymID}/delete" method="post">
                                    <input type="submit" value="Delete" />
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>