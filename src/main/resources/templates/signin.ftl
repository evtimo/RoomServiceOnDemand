<#import "nav.ftl" as nav>
<#-- @ftlvariable name="_csrf" type="org.springframework.security.web.csrf.CsrfToken" -->
<#-- @ftlvariable name="error" type="java.util.Optional<String>" -->
<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>Signin</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap/bootstrap.min.css" rel="stylesheet">


    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            -ms-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
    <link href="css/header.css" rel="stylesheet">
</head>

<body class="text-center" style="background: #fff">

    <@nav.nav/>

    <form class="form-signin" method="post" action="/login">
        <img class="mb-4" src="img/logo.png" alt="" width="80%">

        <label for="inputEmail" class="sr-only">e-mail</label>
        <input type="text" id="inputEmail" name="username" class="form-control" placeholder="e-mail" required autofocus>

        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="password" required>
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>

    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
</body>

</html>