
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
        <title>One Movies an Entertainment Category Flat Bootstrap Responsive Website Template | List :: w3layouts</title>
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
        <link href="css/medile.css" rel='stylesheet' type='text/css' />
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
        <!-- tables -->
        <link rel="stylesheet" type="text/css" href="list-css/table-style.css" />
        <link rel="stylesheet" type="text/css" href="list-css/basictable.css" />
        <script type="text/javascript" src="list-js/jquery.basictable.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('#table').basictable();

                $('#table-breakpoint').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint1').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint2').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint3').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint4').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint5').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint6').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint7').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint8').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint9').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint10').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint11').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint12').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint13').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint14').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint15').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint16').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint17').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint18').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint19').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint20').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint21').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint22').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint23').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint24').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint25').basictable({
                    breakpoint: 768
                });
                $('#table-breakpoint26').basictable({
                    breakpoint: 768
                });
            });
        </script>
        <style>
            .table-container {
                position: relative;
            }

            .back-button {

                bottom: -60px;
                left: 0;
                display: inline-flex;
                align-items: center;
                padding: 12px 20px;
                background-color: #007bff;
                color: #fff;
                border: none;
                border-radius: 20px;
                cursor: pointer;
                transition: background-color 0.3s ease, transform 0.3s ease;
                box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            }

            .back-button:hover {
                background-color: #0056b3;
                transform: translateY(-2px);
            }

            .button-icon {
                margin-right: 8px;
                font-size: 16px;
            }

            .button-text {
                font-weight: 500;
            }
        </style>
        <!-- //tables -->
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
                                    <li><a href="ManageFilmController">Manage Film</a></li>
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
        <!-- faq-banner -->
        <div class="faq">
            <h4 class="latest-text w3_faq_latest_text w3_latest_text">Episode List:</h4>
            <div class="container">
                <div class="agileits-news-top">
                    <ol class="breadcrumb">
                        <li><a href="index.html">Home</a></li>
                        <li class="active">Episode</li>
                    </ol>
                </div>
                <div style="color: red"> ${notice}</div>
                <div class="bs-example bs-example-tabs" role="tabpanel" data-example-id="togglable-tabs">

                    <div id="myTabContent" class="tab-content">
                        <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
                            <div class="agile-news-table">

                                <div class="w3ls-news-result" style="float: right">

                                    <button type="button" class="btn btn-info" data-toggle="modal" data-target="#popupForm">
                                        Add New Episode
                                    </button>

                                    <div class="overlay" data-dismiss="modal"></div>

                                    <!-- Modal Add-->
                                    <div class="modal fade" id="popupForm" tabindex="-1" role="dialog" aria-labelledby="popupFormTitle" aria-hidden="true">
                                        <div class="modal-dialog" role="document">
                                            <div class="modal-content">

                                                <div class="modal-header">
                                                    <h5 class="modal-title" id="popupFormTitle">Add New Episode</h5>

                                                </div>

                                                <div class="modal-body">
                                                    <form action="AddEpisodeAdmin" method="post">
                                                        <div class="form-group">
                                                            <label for="name">Link Episode:</label>
                                                            <input type="text" class="form-control" id="linkepisode" name="linkepisode">
                                                        </div>
                                                        <input type="text" name="filmid" value="${filmid}" readonly="" hidden="">
                                                        <button type="submit" class="btn btn-primary" name="mode" value="add">Submit</button>
                                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                    </form>
                                                </div>

                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <table id="table-breakpoint">
                                    <thead>
                                        <tr>
                                            <th>No.</th>
                                            <th>Movie Name</th>
                                            <th>Episode</th>
                                            <th>Link Episode</th>
                                            <th>Date</th>
                                            <th> </th>
                                            <th> </th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${film.getListEpisode()}" var="episode" varStatus="loop">  
                                            <tr>
                                                <td>${loop.index + 1}</td>
                                                <td class="w3-list-img"><a><img src="${film.getFilm().getLinkImg2()}" alt="" /> <span>${filmepisode.getFilm().getFilmName()}</span></a></td>

                                                <td class="w3-list-info"><a>${episode.getName()}</a></td>
                                                <td class="w3-list-info"><a>${episode.getLinkepisode()}</a></td>
                                                <td>${episode.getDate()}</td>
                                                <td>
                                                    <button type="button" class="btn btn-success" data-toggle="modal" data-target="#popupForm${episode.getEpisodeid()}">
                                                        Update Episode
                                                    </button>
                                                    <div class="overlay" data-dismiss="modal"></div>

                                                    <!-- Modal -->
                                                    <div class="modal fade" id="popupForm${episode.getEpisodeid()}" tabindex="-1" role="dialog" aria-labelledby="popupFormTitle" aria-hidden="true">
                                                        <div class="modal-dialog" role="document">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <h5 class="modal-title" id="popupFormTitle">Update Episode</h5>

                                                                </div>
                                                                <div class="modal-body">
                                                                    <form action="UpdateEpisodeAdmin" method="post">
                                                                        <div class="form-group">
                                                                            <label for="name">Link Episode:</label>
                                                                            <input type="text" class="form-control" id="linkepisode" name="linkepisode" value="${episode.getLinkepisode()}">
                                                                        </div>
                                                                        <input type="text" name="filmid" value="${film.getFilm().getFilmId()}" readonly="" hidden="">
                                                                        <input type="text" name="episodeid" value="${episode.getEpisodeid()}" readonly="" hidden="">
                                                                        <button type="submit" class="btn btn-primary" name="mode" value="update">Submit</button>
                                                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                                    </form>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </td>
                                                <td>
                                                    <c:if test="${!episode.isActive()}">
                                                        <form action="IsActiveEpisodeAdmin" method="post">
                                                            <input type="text" name="filmid" value="${film.getFilm().getFilmId()}" readonly="" hidden="">
                                                            <input type="text" name="episodeid" value="${episode.getEpisodeid()}" readonly="" hidden="">
                                                            <button type="submit" class="btn btn-danger" name="mode" value="true" >
                                                                Active
                                                            </button>
                                                        </form>
                                                    </c:if>
                                                    <c:if test="${episode.isActive()}">
                                                        <form action="IsActiveEpisodeAdmin" method="post">
                                                            <input type="text" name="filmid" value="${film.getFilm().getFilmId()}" readonly="" hidden="">
                                                            <input type="text" name="episodeid" value="${episode.getEpisodeid()}" readonly="" hidden="">
                                                            <button type="submit" class="btn btn-danger" name="mode" value="false" >
                                                                Disable
                                                            </button>
                                                        </form>
                                                    </c:if>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>                                
                            </div>                            
                        </div>

                        <button type="submit" class="back-button">
                            <span class="button-text">
                                <a href="ManageFilmAdmin" style="text-decoration: none; color: white; font-weight: bold;">Back</a>
                            </span>
                        </button>


                    </div>
                </div>
            </div>
        </div>

        <!-- //faq-banner -->
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