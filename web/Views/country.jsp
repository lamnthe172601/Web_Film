<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>One Movies an Entertainment Category Flat Bootstrap Responsive Website Template | General :: w3layouts</title>
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
        <link href="css/medile.css" rel='stylesheet' type='text/css' />
        <link href="css/single.css" rel='stylesheet' type='text/css' />
        <link rel="stylesheet" href="css/contactstyle.css" type="text/css" media="all" />
        <link rel="stylesheet" href="css/faqstyle.css" type="text/css" media="all" />
        <!-- font-awesome icons -->
        <link rel="stylesheet" href="css/font-awesome.min.css" />
        <!-- //font-awesome icons -->
        <!-- news-css -->
        <link rel="stylesheet" href="news-css/news.css" type="text/css" media="all" />
        <!-- //news-css -->
        <!-- list-css -->
        <link rel="stylesheet" href="list-css/list.css" type="text/css" media="all" />
        <!-- //list-css -->
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
        <link href="css/owl.carousel.css" rel="stylesheet" type="text/css" media="all">
        <script src="js/owl.carousel.js"></script>
        <script>
            $(document).ready(function () {
                $("#owl-demo").owlCarousel({

                    autoPlay: 3000, //Set AutoPlay to 3 seconds

                    items: 5,
                    itemsDesktop: [640, 5],
                    itemsDesktopSmall: [414, 4]

                });

            });
        </script> 
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
        <div class="general_social_icons">
            <nav class="social">
                <ul>
                    <li class="w3_twitter"><a href="#">Twitter <i class="fa fa-twitter"></i></a></li>
                    <li class="w3_facebook"><a href="#">Facebook <i class="fa fa-facebook"></i></a></li>
                    <li class="w3_dribbble"><a href="#">Dribbble <i class="fa fa-dribbble"></i></a></li>
                    <li class="w3_g_plus"><a href="#">Google+ <i class="fa fa-google-plus"></i></a></li>				  
                </ul>
            </nav>
        </div>
        <br>
<
        <!-- /w3l-medile-movies-grids -->
        <div class="general-agileits-w3l">
            <div class="w3l-medile-movies-grids">

                <!-- /movie-browse-agile -->

                <div class="movie-browse-agile">
                    <!--/browse-agile-w3ls -->
                    <div class="browse-agile-w3ls general-w3ls">
                        <div class="tittle-head">
                            <h4 class="latest-text">Country: </h4>
                            <div class="container">
                                <div class="agileits-single-top">
                                    <ol class="breadcrumb">
                                        <li><a href="HomeController">Home</a></li>
                                        <li class="active">${country.countryName}</li>
                                    </ol>
                                </div>
                            </div>
                        </div>
                        <div class="container">
                            <div class="browse-inner">
                                <c:forEach items="${listfilm}" var="film">
                                    <div class="col-md-2 w3l-movie-gride-agile">
                                        <a href="FilmDetailController?id=${film.filmId}" class="hvr-shutter-out-horizontal"><img src="${film.linkImg2}" title="album-name" alt=" " />
                                            <div class="w3l-action-icon"><i class="fa fa-play-circle" aria-hidden="true"></i></div>
                                        </a>
                                        <div class="mid-1">
                                            <div class="w3l-movie-text">
                                                <h6><a href="single.html">${film.filmName}</a></h6>							
                                            </div>
                                            <div class="mid-2">

                                                <p>${film.date}</p>
                                                <div class="block-stars">
                                                    <ul class="w3l-ratings">
                                                        <c:forEach begin="1" end="${film.star}">
                                                            <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                                                </c:forEach>


                                                    </ul>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>

                                        </div>
                                        <div class="ribben two">
                                            <p>NEW</p>
                                        </div>	
                                    </div>
                                </c:forEach>
                                <div class="clearfix"> </div>
                            </div>



                        </div>
                    </div>
                    <!--//browse-agile-w3ls -->
                    <!--phan trang-->
                    <div class="blog-pagenat-wthree">
                        <ul>
                            <!--prev-->
                            <c:if test="${endPage!=0}">
                                <c:if test="${index_save<=1}">
                                    <li><a class="frist" href="CountryController?index=${index_save}&id=${save}">Prev</a></li>
                                    </c:if>
                                    <c:if test="${index_save>1}">        
                                    <li><a class="frist" href="CountryController?index=${index_save-1}&id=${save}">Prev</a></li>
                                    </c:if>
                                </c:if>
                            <!--number-->
                            <c:if test="${endPage<=5}">
                                <c:forEach begin="1" end="${endPage}" var="i">

                                    <li><a href="CountryController?index=${i}&id=${save}">${i}</a></li>

                                </c:forEach>
                            </c:if>
                            <c:if test="${endPage>5}">
                                <c:forEach begin="1" end="${endPage}" var="i">
                                    <c:if test="${i<=2}">
                                        <li><a href="CountryController?index=${i}&id=${save}">${i}</a></li>

                                    </c:if>
                                    <c:if test="${i==endPage}">
                                        <li>...<a href="CountryController?index=${i}&id=${save}">${i}</a></li>

                                    </c:if>
                                </c:forEach>
                            </c:if>
                            <!--next-->
                            <c:if test="${endPage!=0}">
                                <c:if test="${endPage<=index_save}">
                                    <li><a class="last" href="CountryController?index=${endPage}&id=${save}">Next</a></li>
                                    </c:if>
                                    <c:if test="${endPage>index_save}">    
                                    <li><a class="last" href="CountryController?index=${index_save+1}&id=${save}">Next</a></li>
                                    </c:if>
                                </c:if>
                        </ul>
                    </div>
                </div>
                <!-- //movie-browse-agile -->
                <!--body wrapper start-->
                <!--body wrapper start-->

            </div>
            <!-- //w3l-medile-movies-grids -->
        </div>
        <!-- //comedy-w3l-agileits -->
        <!-- footer -->
        <div class="footer">
            <div class="container">
                <div class="w3ls_footer_grid">
                    <div class="col-md-6 w3ls_footer_grid_left">
                        <div class="w3ls_footer_grid_left1">
                            <h2>Thanks for watching </h2>
                            <h3 style="color: white">Hope the best will come to you</h3>
                        </div>
                    </div>
                    <div class="col-md-6 w3ls_footer_grid_right">
                        <a href="HomeController"><h2>One<span>Movies</span></h2></a>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="col-md-5 w3ls_footer_grid1_left">
                    <p>&copy; 2016 One Movies. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
                </div>
                <div class="col-md-7 w3ls_footer_grid1_right">
                    <ul>
                        <li>
                            <a href="faq.html">Terms of use</a>
                        </li>
                        <li>
                            <a href="faq.html">Privacy policy</a>
                        </li>
                        <li>
                            <a href="faq.html">FAQ</a>
                        </li>

                        <li>
                            <a href="icons.html">Icons</a>
                        </li>
                        <li>
                            <a href="contact.html">Contact Us</a>
                        </li>
                    </ul>
                </div>
                <div class="clearfix"> </div>
            </div>
        </div>
        <!-- //footer -->
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".dropdown").hover(
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                            $(this).toggleClass('open');
                        },
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                            $(this).toggleClass('open');
                        }
                );
            });
        </script>
        <!-- //Bootstrap Core JavaScript -->
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
                 };
                 */

                $().UItoTop({easingType: 'easeOutQuart'});

            });
        </script>
        <!-- //here ends scrolling icon -->
    </body>
</html>