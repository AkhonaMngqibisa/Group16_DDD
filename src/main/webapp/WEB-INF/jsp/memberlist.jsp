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

    <h2>Members </h2>

    <a href="/member/new">
        <button type="submit">Add new Member</button>
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

            <c:forEach items="${listMembers}" var="member">
                <tbody>
                <tr>
                    <td>${member.memberID}</td>
                    <td>${member.firstName} ${member.lastName}</td>
                    <td><a
                            href="/read/{id}=<c:out value='${member.memberID}' />">View</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                href="/update=<c:out value='${member.memberID}' />">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp; <a
                                href="/delete/{id}=<c:out value='${member.memberID}' />">Delete</a></td>

                </tr>
                </tbody>
            </c:forEach>
        </table>
    </div>

</body>
</html>