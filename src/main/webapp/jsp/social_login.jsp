<%--
  Created by IntelliJ IDEA.
  User: NShkarupa
  Date: 11.04.2018
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html lang="en">--%>
<%--<head>--%>
    <%--<meta charset="utf-8" />--%>
    <%--<meta http-equiv="X-UA-Compatible" content="IE=edge" />--%>
    <%--<title>Login</title>--%>
    <%--<meta name="description" content="" />--%>
    <%--<meta name="viewport" content="width=device-width" />--%>
    <%--<base href="/" />--%>
    <%--<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" />--%>
    <%--<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>--%>
    <%--<script--%>
            <%--src="https://code.jquery.com/jquery-3.3.1.min.js"--%>
            <%--integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="--%>
            <%--crossorigin="anonymous"></script>--%>
    <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"/>--%>
<%--</head>--%>

<%--<body>--%>

<div class="container ">
    <h5>Login Using</h5>

    <form action="/connect/google" method="POST" style="display: inline">
        <input type="hidden" name="scope" value="profile email" />
        <button type="submit" class="btn btn-danger">
            Google <span class="fa fa-google-plus"></span>
        </button>
    </form>

    <form action="/connect/facebook" method="POST" style="display: inline">
        <input type="hidden" name="scope" value="public_profile,email" />
        <button type="submit" class="btn btn-primary">
            Facebook <span class="fa fa-facebook"></span>
        </button>
    </form>

    <form action="/connect/linkedin" method="POST" style="display: inline">
        <input type="hidden" name="scope"
               value="r_basicprofile,r_emailaddress" />
        <button type="submit" class="btn btn-primary">
            LinkedIn <span class="fa fa-linkedin"></span>
        </button>
    </form>
</div>
<%--</body>--%>
<%--</html>--%>
