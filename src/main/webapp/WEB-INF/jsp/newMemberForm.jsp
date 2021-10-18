<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Register</title>
    <link href="../resources/css/form_style.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">

        function validateform()
        {
            var valid = true;

            //--------FistName
            var firstName = document.getElementById("firstName").value;
            if (firstName == null || firstName == "") {
                document.getElementById("firstNameErr").innerHTML = " Firstname field cannot be left empty";
                valid = false;

            } else if (/^[a-zA-Z,.-]{2,50}$/.test(firstName) == false) {
                document.getElementById("firstNameErr").innerHTML = " Please provide a valid firstname";
                valid = false;
            } else {
                document.getElementById("firstNameErr").innerHTML = " ";
                valid = true;
            }
            //--------LastName
            var lastName = document.getElementById("lastName").value;
            if (lastName == null || lastName == "") {
                document.getElementById("lastNameErr").innerHTML = " Lastname field cannot be left empty";
                valid = false;
            } else if (/^[a-zA-Z,.-]{2,50}$/.test(lastName) == false) {
                document.getElementById("lastNameErr").innerHTML = " Please provide a valid lastname";
                valid = false;
            } else {
                document.getElementById("lastNameErr").innerHTML = " ";
                valid = true;
            }
            //--------Age
            var age = document.getElementById("age").value;
            if (age == null || age == "")
            {
                document.getElementById("ageErr").innerHTML = " Age field cannot be left empty";
                valid = false;
            }
            else if (age< 10)
                {
                    document.getElementById("ageErr").innerHTML = " Member cannot be less than 10 years";
                    valid = false;
                }
            else{
                 document.getElementById("ageErr").innerHTML = " ";
                valid = true;
            }

            //--------Email Address
            var emailAddress = document.getElementById("emailAddress").value;
            if (emailAddress == null || emailAddress == "")
            {
                document.getElementById("emailAddressErr").innerHTML = " Email address field cannot be left empty";
                valid = false;
            } else if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/
                .test(emailAddress) == false)
            {
                document.getElementById("emailAddressErr").innerHTML = " Please provide a valid email address";
                valid = false;
            } else {
                document.getElementById("emailAddressErr").innerHTML = " ";
                valid = true;
            }

            //--------Password
            var password = document.getElementById("password").value;
            if (password == null || password == "") {
                document.getElementById("passwordErr").innerHTML = " Password cannot be blank!";
                valid = false;
            } else if (password.length > 20 || password.length < 8) {
                document.getElementById("passwordErr").innerHTML = " Password lenght must be between 8 and 20.";
                valid = false;
            }
            else if (/(?=.*[A-Z])/.test(password) == false) {
                document.getElementById("passwordErr").innerHTML = " Password must have atleast one uppercase.";
                valid = false;
            } else if (/(.*[a-z].*)/.test(password) == false) {
                document.getElementById("passwordErr").innerHTML = " Password must have atleast one lowercase.";
                valid = false;
            } else if (/(.*[0-9].*)/.test(password) == false) {
                document.getElementById("passwordErr").innerHTML = " Password must have atleast one number";
                valid = false;
            } else if (/(.*[@,#,$,%].*$)/.test(password) == false) {
                document.getElementById("passwordErr").innerHTML = " Password must have atleast one special character";
                valid = false;
            } else {
                document.getElementById("passwordErr").innerHTML = " ";
                valid = true;
            }
            var conpassword = document.getElementById("conpassword").value;
            if (conpassword == null || conpassword == "") {
                document.getElementById("confpasswordErr").innerHTML = " Confirm Password cannot be blank!";
                valid = false;
            } else if (password != conpassword)
            {
                document.getElementById("confpasswordErr").innerHTML = " Confirm Password should match with the Password";
                valid = false;
            }
            else{
                document.getElementById("confpasswordErr").innerHTML = " ";
                valid = true;
            }
            return valid;
        }
    </script>



</head>
<body>
<form:form action="/member/create" modelAttribute="member" method="post" onsubmit="return validateform();"   >
         <!--
                </div>
                <div class="login-form">
                    <table>
                      <div class="control-group">
                            <tr>
                                <th>First Name:</th>
                                <td><input type="text" name="firstName" id="firstName" size="45" value="${member.firstName}"
                                           onblur="validateform()" />
                                    <span id="firstNameErr" style="color: red"> </span><br></td>
                            </tr>
                        </div>

                        <div class="control-group">
                            <tr>
                                <th>Last Name:</th>
                                <td><input type="text" name="lastName" id="lastName"
                                           size="45" value="${member.lastName}"
                                           onblur="validateform()" /><span id="lastNameErr"
                                                                           style="color: red"> </span><br></td>
                            </tr>
                        </div>
                        <div class="control-group">
                            <tr>
                                <th>Age:</th>
                                <td><input type="number" name="age" id="age" size="45"
                                           value="${member.age}"
                                           onblur="validateform()" /><span id="ageErr" style="color: red">
							</span> <br></td>
                            </tr>
                        </div>
                        <div class="control-group">
                            <tr>
                                <th>Address:</th>
                                <td><input type="text" name="address" id="address" size="45"
                                           value="${member.address}"
                                           onblur="validateform()" /><span id="addressErr"
                                                                           style="color: red"> </span><br></td>
                            </tr>
                        </div>
                        <div class="control-group">
                            <tr>
                                <th>Phone No:</th>
                                <td><input type="text" name="phoneNo" id="phoneNo" size="45"
                                           value="${member.phoneNo}"
                                           onblur="validateform()" /><span id="phoneNoErr"
                                                                           style="color: red"> </span><br></td>
                            </tr>
                        </div>
                        <div class="control-group">
                            <tr>
                                <th>Email Address:</th>
                                <td><input type="email" name="emailAddress"
                                           id="emailAddress" size="45"
                                           value="${member.emailAddress}"
                                           onblur="validateform()" /> <span id="emailAddressErr"
                                                                            style="color: red"> </span><br></td>
                            </tr>
                        </div>

                        <div class="control-group">
                            <tr>
                                <th>Password:</th>
                                <td><input type="password" id="password" name="password"
                                           size="45" value="${member.password}"
                                           onblur="validateform()" /><span id="passwordErr"
                                                                           style="color: red"> </span> <br></td>
                            </tr>
                        </div>
                        <div class="control-group">
                            <tr>
                                <th>Confirm Password:</th>
                                <td><input type="password" id="conpassword"
                                           name="conpassword" size="45"
                                           value="${member.password}"
                                           onblur="validateform()" /><span id="confpasswordErr"
                                                                           style="color: red"> </span> <br></td>
                            </tr>
                        </div>

                        <tr>

                            <td colspan="2" align="center"><input type="submit" class="btn btn-primary btn-large btn-block" value="Save" /> </br>
                                <button type="reset" class="btn btn-primary btn-large btn-block"
                                        value="Reset">Reset</button></td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    -->

    </div>
    <div class="login-form">
        <table>
            <div class="control-group">
                <tr>
                    <th>First Name:</th>
                    <td><form:input type="text" id="firstName" path="firstName" onblur="validateform()"/></td>
                        <form:errors path="firstName" />
                </tr>
            </div>
            <div class="control-group">
                <tr>
                    <th>Last Name:</th>
                    <td><form:input type="text" id="lastName" path="lastName"  onblur="validateform()"/> </td>
                    <form:errors path="lastName" />
                </tr>
        </div>
            <div class="control-group">
                <tr>
                    <th>Age:</th>
                    <td> <form:input type="number" id="age" path="age"  onblur="validateform()"/></td>
                        <form:errors path="age" />
                </tr>
        </div>
            <div class="control-group">
                <tr>
                    <th>Address:</th>
                    <td><form:input type="text" id="address" path="address"  onblur="validateform()"/></td>
                    <form:errors path="address" />
                </tr>
        </div>

            <div class="control-group">
                <tr>
                    <th>Phone No:</th>
                    <td><form:input type="text" id="phoneNo" path="phoneNo"  onblur="validateform()"/></td>
                    <form:errors path="phoneNo" />
                </tr>
        </div>
            <div class="control-group">
                <tr>
                    <th>Status:</th>
                    <td> <form:input type="text" id="status" path="status" onblur="validateform()"/></td>
                      <form:errors path="status" />
                </tr>
        </div>
            <div class="control-group">
                <tr>
                    <th>Email Address:</th>
                    <td><form:input type="text" id="emailAddress" path="emailAddress"  onblur="validateform()"/><td>
                     <form:errors path="emailAddress" />
                </tr>
        </div>
            <div class="control-group">
                <tr>
                    <th>Password:</th>
                    <td><form:input type="text" id="password" path="password" onblur="validateform()"/> <td>
                    <form:errors path="password" />
                </tr>
        </div>

            <tr>
                <td colspan="2" align="center"><input type="submit" class="btn btn-primary btn-large btn-block" value="Save" /> </br>
                    <button type="reset" class="btn btn-primary btn-large btn-block" value="Reset">Reset</button></td>
            </tr>
        </table>
    </div>
    </div>
    </div>
</form:form>




</body>
</html>