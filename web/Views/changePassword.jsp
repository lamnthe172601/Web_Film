<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <title>One Movies an Entertainment Category Flat Bootstrap Responsive Website Template | News :: w3layouts</title>
        <!-- for-mobile-apps -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="One Movies Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- //for-mobile-apps -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <link rel="stylesheet" href="css/faqstyle.css" type="text/css" media="all" />
        <link href="css/single.css" rel='stylesheet' type='text/css' />
        <link rel="stylesheet" href="css/contactstyle.css" type="text/css" media="all" />
        <!-- news-css -->
        <link rel="stylesheet" href="news-css/news.css" type="text/css" media="all" />
        <!-- //news-css -->
        <!-- list-css -->
        <link rel="stylesheet" href="list-css/list.css" type="text/css" media="all" />
        <!-- //list-css -->
        <!-- font-awesome icons -->
        <link rel="stylesheet" href="css/font-awesome.min.css" />
        <!-- //font-awesome icons -->
        <!-- js -->
        <script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
        <!-- //js -->
        <link href='//fonts.googleapis.com/css?family=Roboto+Condensed:400,700italic,700,400italic,300italic,300' rel='stylesheet' type='text/css'>
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
                });
            });
        </script>
        <!-- start-smoth-scrolling -->
        <style>
            .modal-content {
                margin-top: 230px;
            }
        </style>

    </head>
    <body>
        <!-- header -->
        <div class="header">
            <div class="container">
                <div class="w3layouts_logo">
                    <a href="HomeController"><h1>One<span>Movies</span></h1></a>
                </div>
                <!--search-->
                <div class="w3_search">
                    <form action="SearchController?index=1" method="post">
                        <input type="text" name="Search" placeholder="Search" required="">
                        <input type="submit" value="Go">
                    </form>
                </div>
                <div class="w3l_sign_in_register">
                    <ul>   
                        <c:if test="${account==null}">
                            <li><a href="LoginController" data-target="#myModal">Login</a></li>
                            </c:if>
                            <c:if test="${account!=null}">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="background-color: white;color: black;">
                                    ${account.name}
                                    <b class="caret"></b>
                                </a>
                                <div class="dropdown-menu multi-column columns-3">

                                    <div class="col-sm-3">
                                        <div class="multi-column-dropdown">
                                            <a href="ProfileController" style="width:200px;background-color: white;color: black">Your Profile</a><br>
                                            <a href="ChangePasswordController" style="width: 200px;background-color: white;color: black">Change Password</a>
                                            <a href="LogoutController" style="width: 200px;background-color: white;color: black">Logout</a>
                                        </div>
                                    </div>
                                    <div class="clearfix"></div>

                                </div>
                            </li>
                        </c:if>
                    </ul>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <!-- //header -->
        <!-- bootstrap-pop-up -->

        <!-- //bootstrap-pop-up -->
        <!-- nav -->
        <div class="movies_nav">
            <div class="container">
                <nav class="navbar navbar-default">
                    <div class="navbar-header navbar-left">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                        <nav>
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="HomeController">Home</a></li>
                                <!--Genre-->
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Genres <b class="caret"></b></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <li>
                                            <div class="col-sm-4">
                                                <ul class="multi-column-dropdown">
                                                    <c:forEach items="${listgenre}" var="genre" begin="0" end="5">
                                                        <li><a href="GenreController?id=${genre.genreId}&index=1">${genre.genreName}</a></li>
                                                        </c:forEach>   





                                                </ul>
                                            </div>
                                            <div class="col-sm-4">
                                                <ul class="multi-column-dropdown">
                                                    <c:forEach items="${listgenre}" var="genre" begin="6" end="12">
                                                        <li><a href="GenreController?id=${genre.genreId}&index=1">${genre.genreName}</a></li>
                                                        </c:forEach>
                                                </ul>
                                            </div>
                                            <div class="col-sm-4">
                                                <ul class="multi-column-dropdown">
                                                    <c:forEach items="${listgenre}" var="genre" begin="13" >
                                                        <li><a href="GenreController?id=${genre.genreId}&index=1">${genre.genreName}</a></li>
                                                        </c:forEach>
                                                </ul>
                                            </div>
                                            <div class="clearfix"></div>
                                        </li>
                                    </ul>
                                </li>
                                <li><a href="SeriesController?index=1">tv - series</a></li>

                                <li class="dropdown">
                                    <!--Country-->
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Country <b class="caret"></b></a>
                                    <ul class="dropdown-menu multi-column columns-3">
                                        <li>
                                            <div class="col-sm-4">
                                                <ul class="multi-column-dropdown">
                                                    <c:forEach items="${listcountry}" var="country" begin="0" end="3">
                                                        <li><a href="CountryController?id=${country.countryId}&index=1">${country.countryName}</a></li>
                                                        </c:forEach>
                                                </ul>
                                            </div>
                                            <div class="col-sm-4">
                                                <ul class="multi-column-dropdown">
                                                    <c:forEach items="${listcountry}" var="country" begin="4" end="7">
                                                        <li><a href="CountryController?id=${country.countryId}&index=1">${country.countryName}</a></li>
                                                        </c:forEach>
                                                </ul>
                                            </div>
                                            <div class="col-sm-4">
                                                <ul class="multi-column-dropdown">
                                                    <c:forEach items="${listcountry}" var="country" begin="8">
                                                        <li><a href="CountryController?id=${country.countryId}&index=1">${country.countryName}</a></li>
                                                        </c:forEach>
                                                </ul>
                                            </div>
                                            <div class="clearfix"></div>
                                        </li>
                                    </ul>
                                </li>
                                <li><a href="SingleController?index=1">Single Film</a></li>
                                    <c:if test='${account.getRoleId()=="2"}'>
                                    <li><a href="MyFilmController">My Film</a></li>
                                    </c:if>
                                   <c:if test='${account.getRoleId()=="1"}'>
                                    <li class="dropdown">
                                        <!--Country-->
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Manage DATA<b class="caret"></b></a>
                                        <ul class="dropdown-menu multi-column columns-3">
                                            <li>
                                                <div class="col-sm-4">
                                                    <ul class="multi-column-dropdown">                                                    
                                                        <li><a href="ManageFilmAdmin">ManageFilm</a></li>
                                                        <li><a href="ManageUserAdmin">ManageUser</a></li>

                                                    </ul>
                                                </div>                                            
                                                <div class="clearfix"></div>
                                            </li>
                                        </ul>
                                    </li>
                                </c:if>
                            </ul>
                        </nav>
                    </div>
                </nav>	
            </div>
        </div>
        <!-- //nav -->
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    Change Password
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>						
                </div>
                <section>
                    <div class="modal-body">
                        <div class="w3_login_module">
                            <div class="module form-module">
                                <div><i class="fa fa-times fa-pencil"></i>
                                </div>

                                <div class="form">
                                    <div style="color: red">${notice}</div>
                                    <form action="ChangePasswordController" method="post">
                                        <input type="password" name="Password" placeholder="Password" required="">
                                        <input type="password" name="Newpassword" placeholder="Newpassword" required="">
                                        <input type="password" name="ConfirmNewpassword" placeholder="ConfirmNewpassword" required="">
                                        <input type="submit" value="Change">
                                    </form>
                                </div>
                            </div>
                            <div style="color: red">${mess}</div>        
                        </div>
                    </div>
                </section>
            </div>
        </div>

    </body>
</html>
