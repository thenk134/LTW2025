<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Colami shop - Login</title>

    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="project/css/bootstrap.min.css">
    <link rel="stylesheet" href="project/css/font-awesome.min.css">
    <link rel="stylesheet" href="project/css/owl.carousel.css">
    <link rel="stylesheet" href="project/style1.css">
    <link rel="stylesheet" href="project/css/responsive.css">
</head>

<body>
<div class="site-branding-area">
    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                <div class="logo">
                    <a href="project"><img src="project/img/logo.png"></a>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="mainmenu-area">
    <div class="container">
        <div class="row">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a href="home">Home</a></li> <li><a href="project/shop.html">Shop page</a></li>
                    <li><a href="project/cart.html">Cart</a></li>
                    <li><a href="project/checkout.html">Check out</a></li>
                    <li><a href="project/contact.html">Contact</a></li>
                    <li class="active"><a href="login.jsp">Log in</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>

<div class="box">
    <div class="inner-box">

        <form action="login" method="post">

            <h2>Log in</h2>

            <p style="color: red; text-align: center; font-weight: bold;">${mess}</p>

            <input style="font-size: 17px;" type="text" name="user" placeholder="User name" required/>

            <input style="font-size: 17px;" type="password" name="pass" placeholder="Password" required/>

            <p>
                <input type="checkbox" /><span> Keep me Signed in</span>
                <span class="forgot" ><a href="project/forgot.html">Forgot password?</a></span>
            </p>

            <input type="submit" value="Log in" />

            <p style="text-align:center;" >
                <span>Or Sign in with</span>
            </p>

            <div class="flex-c-m">
                <a href="#" class="login100-social-item bg1"><i class="fa fa-facebook"></i></a>
                <a href="#" class="login100-social-item bg2"><i class="fa fa-twitter"></i></a>
                <a href="#" class="login100-social-item bg3"><i class="fa fa-google"></i></a>
            </div>

            <p style="text-align:right;" >
                <span>Not a member? </span><a class="link" href="project/register.html">Sign up</a>
            </p>

        </form>
    </div>
</div>

<div class="footer-top-area">
    <div class="zigzag-bottom"></div>
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-sm-6">
                <div class="footer-about-us">
                    <h2 style="text-align: left;">Colami</h2>
                    <div class="footer-social">
                        <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                        <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                        <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                        <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script src="project/js/owl.carousel.min.js"></script>
<script src="project/js/jquery.sticky.js"></script>
<script src="project/js/jquery.easing.1.3.min.js"></script>
<script src="project/js/main.js"></script>
</body>
</html>