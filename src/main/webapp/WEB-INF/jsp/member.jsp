<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Members</title>
    <link href="../resources/css/table_style.css" rel="stylesheet" type="text/css">
</head>
<body>
<h2>${member.firstName} ${member.lastName} Information</h2>
<div class="table-wrapper">
    <table class="fl-table">
        <thead>
        <tr>
            <th>ID</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Age</th>
            <th>Address</th>
            <th>Phone No</th>
            <th>Email Address</th>
            <th>Password</th>
            <th>Status</th>
            <th>Manage</th>
        </tr>

        </thead>

        <tbody>
        <tr>
            <td>${member.memberID}</td>
            <td>${member.firstName}</td>
            <td>${member.lastName}</td>
            <td>${member.age}</td>
            <td>${member.address}</td>
            <td>${member.phoneNo}</td>
            <td>${member.emailAddress}</td>
            <td>${member.password}</td>
            <td>${member.status}</td>

            <td>
                <a href="/update=<c:out value='${member.memberID}' />">Update</a>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a href="/delete/{id}=<c:out value='${member.memberID}' />">Delete</a>
            </td>
        </tr>
        </tbody>
    </table>
</div>

</body>
</html>