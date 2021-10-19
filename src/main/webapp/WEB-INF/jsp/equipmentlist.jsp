<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Equipment</title>
    <link href="../resources/css/table_style.css" rel="stylesheet" type="text/css">

</head>
<body>

    <h2>Equipments</h2>

    <a href="/equipment/new">
        <button type="submit">Add new Equipment</button>
    </a>
    <br/><br/>

    <div class="table-wrapper">
        <table class="fl-table">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Manage</th>
            </tr>

            </thead>

            <c:forEach items="${listEquipments}" var="member">
                <tbody>
                <tr>
                    <td>${equipment.equipmentID}</td>
                    <td>${equipment.Name} ${equipment.Model}</td>
                    <td><a
                            href="/read/{id}=<c:out value='${equipment.equipmentID}' />">View</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                href="/update=<c:out value='${equipment.equipmentID}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                href="/delete/{id}=<c:out value='${member.memberID}' />">Delete</a></td>

                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>

</body>
</html>