<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login</title>
    <link rel="stylesheet" href="css/login/login.css">

    <script type="text/javascript">
        function validateLogins()
        {
            //--------Username
            var username = document.getElementById("username").value;
            if (username == null || username == "") {
                document.getElementById("usernameErr").innerHTML = " Username field cannot be left empty!";
            } else {
                document.getElementById("usernameErr").innerHTML = " ";
            }
            //--------Password
            var password = document.getElementById("password").value;
            if (password == null || password == "") {
                document.getElementById("passwordErr").innerHTML = " Password cannot be blank!";
            } else {
                document.getElementById("passwordErr").innerHTML = " ";
            }
        }
    </script>
</head>
<body>
<form id= "ResourceLogin" action="ResourceServlet?action=resourceLogin.do" method="post" >
    <div class="login">
        <div class="login-screen">
            <div class="app-title">
                <h1>Login</h1>
            </div>
            <div class="login-form">
                <div class="control-group">
                    <input type="text" class="login-field" value="" placeholder="username" id="login-name" name="username" required>
                    <label class="login-field-icon fui-user" for="login-name"></label>
                </div>

                <div class="control-group">
                    <input type="password" class="login-field" value="" placeholder="password" id="login-pass" name="password" required>
                    <label class="login-field-icon fui-lock" for="login-pass"></label>
                </div>

                <a class="btn btn-primary btn-large btn-block" href="#">login</a>
                <a class="login-link" href="#">Lost your password?</a>
            </div>
        </div>
    </div>
</form>


</body>
</html>