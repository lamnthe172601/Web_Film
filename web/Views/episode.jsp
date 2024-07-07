
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>One Movies an Entertainment Category Flat Bootstrap Responsive Website Template | Single :: w3layouts</title>
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
        <script src="js/simplePlayer.js"></script>
        <script>
            $("document").ready(function () {
                $("#video").simplePlayer();
            });
        </script>
        <!--?�y l� css c?a n�t chuy?n t?p-->
        <style>
            /* CSS cho n�t */
            .episode-button {
                background-color: #3498db;
                color: white;
                border: none;
                padding: 10px 20px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                cursor: pointer;
                border-radius: 4px;
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
        <!-- single -->
        <div class="single-page-agile-main">
            <div class="container">
                <!-- /w3l-medile-movies-grids -->
                <div class="agileits-single-top">
                    <ol class="breadcrumb">
                        <li><a href="index.html">Home</a></li>
                        <li class="active">FilmDetail</li>
                        <li class="active">Episode</li>
                    </ol>
                </div>
                <div class="single-page-agile-info">
                    <!-- /movie-browse-agile -->
                    <div class="show-top-grids-w3lagile">
                        <div class="col-sm-8 single-left">
                            <div class="song">
                                <div class="song-info">
                                    <h1 style="color: brown">${filmdetail.filmName}</h1>
                                    <hr>
                                </div>
                                <div class="video-grid-single-page-agileits">
                                    <div data-video="${episodedetail.getLinkepisode()}" id="video"> <img src="${filmdetail.linkImg}" alt="" class="img-responsive" /> </div>
                                </div>
                            </div>
                            <h3 style="color: brown">${filmdetail.filmName} - Episode ${episodedetail.getName()}</h3>    
                            <div class="clearfix"> </div>
                            <form id="episode-form" action="EpisodeController" method="post">
                                <div id="episode-buttons">
                                    <!-- Danh s�ch c�c n�t chuy?n s? t?p -->
                                    <label style="color: #003333">Episode:</label>
                                    <input type="text" name="id" value="${filmdetail.filmId}" hidden readonly>
                                    <c:forEach items="${episodelist}" var="episode">

                                        <c:if test="${episode.isActive()}" >                                               
                                            <button class="episode-button" type="submit" name="episodeid" value="${episode.getEpisodeid()}"> ${episode.getName()}</button>
                                        </c:if>
                                        <c:if test="${!episode.isActive()}" >
                                            <button class="episode-button" type="reset" > ${episode.getName()}</button>
                                        </c:if>
                                    </c:forEach>
                                    <!-- Th�m c�c button t??ng ?ng v?i s? t?p c?a b? film -->
                                </div>
                            </form>    
                        </div>
                        <div class="col-md-4 single-right">
                            <h3>Top View</h3>
                            <c:forEach items="${mayconcern}" var="film" >
                                <div class="single-grid-right">

                                    <div class="single-right-grids">
                                        <div class="col-md-4 single-right-grid-left">
                                            <a href="FilmDetailController?id=${film.filmId}"><img src="${film.linkImg2}" alt="" /></a>
                                        </div>
                                        <div class="col-md-8 single-right-grid-right">
                                            <a href="FilmDetailController?id=${film.filmId}" class="title">${film.filmName}</a>

                                            <p class="views">${film.getView()}</p>
                                        </div>
                                        <div class="clearfix"> </div>
                                    </div>


                                </div>
                            </c:forEach>
                        </div>



                        <div class="clearfix"> </div>
                    </div>
                    <!-- //movie-browse-agile -->
                    <!--body wrapper start-->
                    <div class="w3_agile_banner_bottom_grid">
                        <div id="owl-demo" class="owl-carousel owl-theme">
                            <c:forEach items="${relatefilmlist}" var="relatefilm">
                                <div class="item">
                                    <div class="w3l-movie-gride-agile w3l-movie-gride-agile1">
                                        <a href="FilmDetailController?id=${relatefilm.getFilmId()}" class="hvr-shutter-out-horizontal"><img src="${relatefilm.getLinkImg2()}" title="album-name" class="img-responsive" alt=" " />
                                            <div class="w3l-action-icon"><i class="fa fa-play-circle" aria-hidden="true"></i></div>
                                        </a>
                                        <div class="mid-1 agileits_w3layouts_mid_1_home">
                                            <div class="w3l-movie-text">
                                                <h6><a href="single.html">${relatefilm.getFilmName()}</a></h6>							
                                            </div>
                                            <div class="mid-2 agile_mid_2_home">
                                                <p>${relatefilm.getDate() }</p>
                                                <div class="block-stars">
                                                    <ul class="w3l-ratings">
                                                        <c:forEach begin="1" end="${relatefilm.getStar()}">
                                                            <li><a href="#"><i class="fa fa-star" aria-hidden="true"></i></a></li>
                                                                </c:forEach>
                                                    </ul>
                                                </div>
                                                <div class="clearfix"></div>
                                            </div>
                                        </div>
                                        <div class="ribben">
                                            <p>NEW</p>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </div>
                    <!--body wrapper end-->


                </div>
                <!-- //w3l-latest-movies-grids -->
            </div>	
        </div>
        <!-- //w3l-medile-movies-grids -->

        <!-- footer -->
        <div class="footer">
            <div class="container">
                <div class="w3ls_footer_grid">
                    <div class="col-md-6 w3ls_footer_grid_left">
                        <div class="w3ls_footer_grid_left1">
                            <h2>Subscribe to us</h2>
                            <div class="w3ls_footer_grid_left1_pos">
                                <form action="#" method="post">
                                    <input type="email" name="email" placeholder="Your email..." required="">
                                    <input type="submit" value="Send">
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 w3ls_footer_grid_right">
                        <a href="index.html"><h2>One<span>Movies</span></h2></a>
                    </div>
                    <div class="clearfix"> </div>
                </div>
                <div class="col-md-5 w3ls_footer_grid1_left">
                    <p>&copy; 2016 One Movies. All rights reserved | Design by <a href="http://w3layouts.com/">W3layouts</a></p>
                </div>
                <div class="col-md-7 w3ls_footer_grid1_right">
                    <ul>
                        <li>
                            <a href="genres.html">Movies</a>
                        </li>
                        <li>
                            <a href="faq.html">FAQ</a>
                        </li>
                        <li>
                            <a href="horror.html">Action</a>
                        </li>
                        <li>
                            <a href="genres.html">Adventure</a>
                        </li>
                        <li>
                            <a href="comedy.html">Comedy</a>
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