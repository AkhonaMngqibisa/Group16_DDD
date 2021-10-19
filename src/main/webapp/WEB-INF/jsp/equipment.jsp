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
<h2>${equipmentID.Name} ${equipment.Model} Information</h2>
<div class="table-wrapper">
    <table class="fl-table">
        <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Model</th>
            <th>Info</th>

        </tr>

        </thead>

        <tbody>
        <tr>
            <td>${equipment.equipmentID}</td>
            <td>${equipment.equipmentName}</td>
            <td>${equipment.equipmentModel}</td>
            <td>${equipment.equipmentInfo}</td>


            <td>
                <a href="/update=<c:out value='${equipment.equipmentID}' />">Update</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/delete/{id}=<c:out value='${equipment.equipmentID}' />">Delete</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>