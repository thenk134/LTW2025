<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Colami shop</title>

    <!-- Google Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

    <!-- Bootstrap -->
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <!-- Font Awesome -->
    <link rel="stylesheet" href="css/font-awesome.min.css">

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="style1.css">
    <link rel="stylesheet" href="css/responsive.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
    <div class="site-branding-area">
        <div class="container">
            <div class="row">
                <div class="col-sm-6">
                    <div class="logo">
                        
                            <a href="./"><img src="img/logo.png"></a>
                       
                    </div>
                </div>

                <div class="col-sm-6">
                    <div class="shopping-item">
                        <a href="cart.jsp">Cart <span class="cart-amunt"></span> <i class="fa fa-shopping-cart"></i> <span class="product-count">5</span></a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End site branding area -->

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

                        <li ><a href="index.jsp">Home</a></li>
                        <li><a href="shop.jsp">Shop page</a></li>

                        <li><a href="cart.jsp">Cart</a></li>
                        <li><a href="checkout.jsp">Check out</a></li>

                        <li><a href="contact.jsp">Contact</a></li>
                        
                        <li class="active"><a href="login.jsp">Log in</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <div class="box">
	
		<div class="inner-box">
		<%
		String baoLoi = request.getAttribute("baoLoi") + "";
		baoLoi = (baoLoi.equals("null"))? "": baoLoi;
		
		String tendangnhap = request.getAttribute("tendangnhap")+ "";
		tendangnhap = (tendangnhap.equals("null"))? "": tendangnhap;
		
		String tenkhachhang = request.getAttribute("tenkhachhang")+ "";
		tenkhachhang = (tenkhachhang.equals("null"))? "": tenkhachhang;
		
		String email = request.getAttribute("email")+ "";
		email = (email.equals("null"))? "": email;
		
		%>
		<form action="dangky" method="post" >

		<h2>Sign up </h2>
		<div class = "red" id = "baoLoi">
			<%=baoLoi %>
		</div>
		<input style="font-size: 17px;" type="text" name="tenkhachhang" placeholder="Your full name" required = "required" value = "<%=tenkhachhang%>"/>
		<input style="font-size: 17px;" type="text" name="tendangnhap" placeholder="User name" required = "required" value = "<%=tendangnhap%>"/>
		<input style="font-size: 17px;" type="email" name="email" placeholder="Email address" required = "required" value = "<%=email%>"/>
		<input style="font-size: 17px;" type="password" name="matkhau" placeholder="matkhau" required onkeyup="kiemTraMatKhau()"     />
		<input style="font-size: 17px;" type="password" name="matKhauNhapLai" placeholder="Confirm password" required onkeyup="kiemTraMatKhau()" />
		<input style="font-size: 17px;" type="submit" value="Sign up" />
        <p style="text-align:center;" >
            <span>Or Sign up with</span>

        </p>
        <p></p>
        <div class="flex-c-m">
            <a href="https://www.facebook.com/" target="blank" class="login100-social-item bg1">
                <i class="fa fa-facebook"></i>
            </a>

            <a href="https://twitter.com/" target="blank" class="login100-social-item bg2">
                <i class="fa fa-twitter"></i>
            </a>

            <a href="https://www.google.com.vn/" target="blank" class="login100-social-item bg3">
                <i class="fa fa-google"></i>
            </a>
        </div>
		
		<p style="text-align:center;" >
				<span>Already register ? </span><a class="link" href="login.jsp">Sign in</a>
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

                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title" style="text-align: left;">User Navigation </h2>
                        <ul>
                            <li><a href="#">My account</a></li>
                            <li><a href="#">Order history</a></li>
                            <li><a href="#">Wishlist</a></li>
                            <li><a href="#">Vendor contact</a></li>
                            <li><a href="#">Front page</a></li>
                        </ul>
                    </div>
                </div>

                <div class="col-md-3 col-sm-6">
                    <div class="footer-menu">
                        <h2 class="footer-wid-title" style="text-align: left;">Categories</h2>
                        <ul>
                            <li><a href="#">Mobile Phone</a></li>                          
                            <li><a href="#">Accessories</a></li>
                            <li><a href="#">Laptop</a></li>                           
                        </ul>
                    </div>
                </div>

                <div class="col-md-3 col-sm-6">
                    <div class="footer-newsletter">
                        <h2 class="footer-wid-title" style="text-align: left;">Newsletter</h2>
                        <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                        <div class="newsletter-form">
                            <form action="#">
                                <input  style="font-size: 17px;" type="email" placeholder="Type your email">
                                <input type="submit" value="Subscribe">
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>



    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>

    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>

    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>

    <!-- Main Script -->
    <script src="js/main.js"></script>

    <!-- Slider -->
    <script type="text/javascript" src="js/bxslider.min.js"></script>
    <script type="text/javascript" src="js/script.slider.js"></script>
</body>




<script>
	function kiemTraMatKhau(){
		matkhau = document.getElementById("matkhau").value;
		matKhauNhapLai = document.getElementById("matKhauNhapLai").value;
		if(matKhau!=matKhauNhapLai){
			document.getElementById("msg").innerHTML = "Mật khẩu không khớp!";
			return false;
		}else{
			document.getElementById("msg").innerHTML = "";
			return true;
		}
	}
	
	function xuLyChonDongY(){
		dongYDeuKhoan = document.getElementById("dongYDieuKhoan");
		if(dongYDeuKhoan.checked==true){
			document.getElementById("submit").style.visibility="visible";
		} else {
			document.getElementById("submit").style.visibility="hidden";
		}
	}
</script>















</html>