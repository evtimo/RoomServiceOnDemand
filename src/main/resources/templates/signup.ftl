<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>Sign Up</title>

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
    <link href="css/signup.css" rel="stylesheet">
</head>

<body class="text-center" style="background: #fff">
    <form class="form-signup">
        <img class="mb-4" src="img/logo.png" alt="" width="80%">

        <label for="inputEmail" class="sr-only">e-mail</label>
        <input type="email" id="inputEmail" class="form-control" placeholder="e-mail" required autofocus>

        <label for="inputName" class="sr-only">full name</label>
        <input type="text" id="inputName" class="form-control" placeholder="full name" required autofocus>

        <label for="inputPhone" class="sr-only">phone</label>
        <input type="text" id="inputPhone" class="form-control" placeholder="phone" required autofocus>

        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" placeholder="password" required>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
    </form>

    <script src="js/jquery-3.4.1.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap/bootstrap.min.js"></script>
</body>

</html>