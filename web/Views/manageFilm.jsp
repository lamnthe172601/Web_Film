
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
        <!-- //tables -->
        <style>
            .btn-success-custom {
                background-color: #28a745;
                color: #fff;
                border-radius: 20px;
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
        <!-- faq-banner -->
        <div class="faq">
            <h4 class="latest-text w3_faq_latest_text w3_latest_text">Movies List</h4>
            <div class="container">
                <div class="agileits-news-top">
                    <ol class="breadcrumb">
                        <li><a href="HomeController">Home</a></li>
                        <li class="active">Manage Film</li>
                    </ol>
                </div>
                <div id="myTabContent" class="tab-content">
                    <div role="tabpanel" class="tab-pane fade in active" id="home" aria-labelledby="home-tab">
                        <div class="agile-news-table">
                            <div class="d-flex justify-content-between align-items-center mb-3">
                                <div class="w3ls-news-result" style="float: right">
                                    <div class="w3ls-news-result" style="float: right">
                                        <a href="#" data-toggle="modal" data-target="#addFilmModal" class="btn btn-success-custom btn-lg">
                                            <i class="fa fa-plus"></i> Add New Film
                                        </a>
                                    </div>
                                </div>
                                <form action="ManageFilmAdmin" method="post" class="form-inline">
                                    <div class="input-group">
                                        <div class="input-group-append">
                                            <input type="text" name="search" placeholder="Search" class="form-control" required>
                                            <button type="submit" class="btn btn-primary">
                                                <i class="fa fa-search"></i> Search
                                            </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <table id="table-breakpoint" class="table table-striped table-bordered table-hover" style="width:100%; color: #333;">
                                <thead>
                                    <tr>
                                        <th class="text-center" style="width: 50px; color: #333;">No.</th>
                                        <th class="text-center" style="width: 150px;color: #333;">Movie Name</th>
                                        <th class="text-center" style="width: 100px;color: #333;">Views</th>
                                        <th class="text-center" style="width: 150px;color: #333;">Release Date</th>
                                        <th class="text-center" style="width: 100px;color: #333;">Status</th>
                                        <th class="text-center" style="width: 120px;color: #333;">Country</th>
                                        <th class="text-center" style="width: auto;color: #333;">Genre</th>
                                        <th class="text-center" style="width: 50px;color: #333;">Episode</th>
                                        <th class="text-center" style="width: 100px;color: #333;">Actions</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach items="${listFilmInfo}" var="list" varStatus="loop">
                                        <tr>
                                            <td class="text-center">${loop.index + 1}</td>
                                            <td class=" d-flex align-items-center" style="color: #333;">                                                
                                                <img src="${list.getFilm().linkImg2}" alt="" style="width: 50px; height: 50px; margin-right: 10px;" />
                                                <br>
                                                <span style="color: #333;">${list.getFilm().getFilmName()}</span>                                                                                                    
                                            </td>
                                            <td class="text-center"style="color: #333;">${list.getFilm().getView()}</td>
                                            <td class="text-center"style="color: #333;">${list.getFilm().getDate()}</td>
                                            <td class="text-center"style="color: #333;">
                                                <c:if test="${list.getFilm().isIsSeries()}">TV-Series</c:if>
                                                <c:if test="${!list.getFilm().isIsSeries()}">Single Film</c:if>
                                                </td>
                                                <td class="text-center"style="color: #333;">${list.getCountry().getCountryName()}</td>
                                            <td class="text-center"style="color: #333;">
                                                <div class="d-flex flex-wrap genre-list">
                                                    <c:forEach items="${list.getGenre()}" var="g">
                                                        <span class="badge badge-primary mr-2 mb-2">${g.genreName}</span>
                                                    </c:forEach>
                                                </div>
                                            </td>
                                            <td class="text-center">    
                                                <form action="ManageEpisodeAdmin" method="post">
                                                    <input type="hidden" name="filmid" value="${list.getFilm().filmId}" hidden="">
                                                    ${list.getAmountEpisode()}                                                                                                       
                                                    <button type="submit" class="btn btn-info btn-sm">
                                                        <i class="fa fa-edit"></i> Edit Episodes
                                                    </button>
                                                </form>
                                            </td>
                                            <td class="text-center">
                                                <div class="action-buttons">
                                                    <a href="#" data-toggle="modal" data-target="#popupForm${list.getFilm().filmId}" class="btn btn-primary btn-block btn-sm"  >                                                  
                                                        <i class="fa fa-edit"></i> Update
                                                    </a>
                                                    <%-- form update--%>  
                                                    <div class="modal fade" id="popupForm${list.getFilm().filmId}" tabindex="-1" role="dialog" aria-labelledby="popupFormTitle" aria-hidden="true">
                                                        <div class="modal-dialog" role="document">
                                                            <div class="modal-content">
                                                                <div class="modal-header">
                                                                    <h5 class="modal-title" id="popupFormTitle">Update New Film</h5>

                                                                </div>
                                                                <div class="modal-body">
                                                                    <form action="UpdateFilmAdmin" method="post">
                                                                        <input type="filmid" name="filmid" value="${list.getFilm().filmId}" readonly="" hidden="">
                                                                        <div class="form-group">
                                                                            <label for="name">Name:</label>
                                                                            <input type="text" class="form-control" id="name" name="name" value="${list.getFilm().filmName}">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label for="description">Description:</label>
                                                                            <textarea id="description" name="description" class="form-control" style="height: 200px">${list.getFilm().description}</textarea>
                                                                        </div>
                                                                        <div style="display: flex">
                                                                            <div class="col-lg-6">
                                                                                <label for="country">Country:</label>
                                                                                <select name="country" id="country" class="form-control">
                                                                                    <c:forEach items="${listcountry}" var="country">
                                                                                        <c:if test="${country.countryId==list.getCountry().countryId}">
                                                                                            <option value="${country.countryId}" selected>${country.countryName}</option>
                                                                                        </c:if>
                                                                                        <c:if test="${country.countryId!=list.getCountry().countryId}">
                                                                                            <option value="${country.countryId}">${country.countryName}</option>
                                                                                        </c:if>
                                                                                    </c:forEach>
                                                                                </select>
                                                                            </div>
                                                                            <div class="col-lg-6">
                                                                                <label for="status">Status:</label>
                                                                                <select name="status" id="status" class="form-control">
                                                                                    <c:if test="${list.getFilm().isSeries}" >
                                                                                        <option value="1" selected>TV-Series</option>
                                                                                        <option value="0">Single Film</option>
                                                                                    </c:if>
                                                                                    <c:if test="${!list.getFilm().isSeries}" >
                                                                                        <option value="1">TV-Series</option>
                                                                                        <option value="0" selected>Single Film</option>
                                                                                    </c:if>
                                                                                </select>
                                                                            </div>
                                                                        </div>
                                                                        <br>
                                                                        <div class="form-group">
                                                                            <label for="genre">Genre:</label><br>
                                                                            <table>
                                                                                <tr>
                                                                                    <c:set var="i" value="0" />
                                                                                    <c:forEach items="${listgenre}" var="genre" begin="0" end="4">

                                                                                        <td id="genre${genre.genreId}">
                                                                                            <input type="checkbox" name="genre" value="${genre.genreId}" id="genre${genre.genreId}"
                                                                                                   <c:forEach items="${list.genre}" var="genrechose">
                                                                                                       <c:if test="${genrechose.genreId==genre.genreId}">
                                                                                                           checked=""
                                                                                                       </c:if>
                                                                                                   </c:forEach>>
                                                                                            <label for="genre${genre.genreId}">${genre.genreName}</label>
                                                                                        </td>
                                                                                    </c:forEach>
                                                                                </tr>
                                                                                <tr>
                                                                                    <c:forEach items="${listgenre}" var="genre" begin="5" end="9" >
                                                                                        <td>
                                                                                            <input type="checkbox" name="genre" value="${genre.genreId}" id="genre${genre.genreId}"
                                                                                                   <c:forEach items="${list.genre}" var="genrechose">
                                                                                                       <c:if test="${genrechose.genreId==genre.genreId}">
                                                                                                           checked=""
                                                                                                       </c:if>
                                                                                                   </c:forEach>
                                                                                                   >
                                                                                            <label for="genre${genre.genreId}">${genre.genreName}</label>
                                                                                        </td>
                                                                                    </c:forEach>      
                                                                                </tr>
                                                                                <tr>
                                                                                    <c:forEach items="${listgenre}" var="genre" begin="10" end="14" >
                                                                                        <td>
                                                                                            <input type="checkbox" name="genre" value="${genre.genreId}" id="genre${genre.genreId}"
                                                                                                   <c:forEach items="${list.genre}" var="genrechose">
                                                                                                       <c:if test="${genrechose.genreId==genre.genreId}">
                                                                                                           checked=""
                                                                                                       </c:if>
                                                                                                   </c:forEach>>
                                                                                            <label for="genre${genre.genreId}">${genre.genreName}</label>
                                                                                        </td>
                                                                                    </c:forEach>          

                                                                                </tr>
                                                                                <tr>

                                                                                    <c:forEach items="${listgenre}" var="genre" begin="15" >
                                                                                        <td>
                                                                                            <input type="checkbox" name="genre" value="${genre.genreId}" id="genre${genre.genreId}"
                                                                                                   <c:forEach items="${list.genre}" var="genrechose">
                                                                                                       <c:if test="${genrechose.genreId==genre.genreId}">
                                                                                                           checked=""
                                                                                                       </c:if>
                                                                                                   </c:forEach>>
                                                                                            <label for="genre${genre.genreId}">${genre.genreName}</label>
                                                                                        </td>
                                                                                    </c:forEach>          

                                                                                </tr>
                                                                            </table>
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label for="linkImg">Link First Image:</label>
                                                                            <input type="text" class="form-control" id="linkImg" name="linkImg" required="" value="${list.getFilm().linkImg}">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label for="linkImg2">Link Second Image:</label>
                                                                            <input type="text" class="form-control" id="linkImg2" name="linkImg2" required="" value="${list.getFilm().linkImg2}">
                                                                        </div>
                                                                        <div class="form-group">
                                                                            <label for="trailer">Link Trailer:</label>
                                                                            <input type="text" class="form-control" id="trailer" name="trailer" required="" value="${list.getFilm().linkTrailer}">
                                                                        </div>

                                                                        <button type="submit" class="btn btn-primary" name="mode" value="update">Update</button>
                                                                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                                                    </form>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <c:if test="${list.getFilm().isIsActive()}">                   
                                                        <a href="IsActiveFilmAdmin?filmid=${list.getFilm().filmId}&mode=false" class="btn btn-danger btn-block btn-sm">
                                                            <i class="fa fa-trash"></i> Disable
                                                        </a>
                                                    </c:if>
                                                    <c:if test="${!list.getFilm().isIsActive()}">                  
                                                        <a href="IsActiveFilmAdmin?filmid=${list.getFilm().filmId}&mode=true" class="btn btn-danger btn-block btn-sm" style="background-color: #28a745; color: white;">
                                                            <i class="fa fa-trash"></i> Active
                                                        </a>
                                                    </c:if>
                                                </div>
                                            </td>
                                        </tr>
                                    </c:forEach>
                                </tbody>
                            </table>
                        </div>
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
        <!--  form add film -->
        <form action="AddNewFilmAdmin" method="post">
            <div class="modal fade" id="addFilmModal" tabindex="-1" role="dialog" aria-labelledby="addFilmModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-lg" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="addFilmModalLabel">Add New Film</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="filmName">Film Name</label>
                                    <input type="text" class="form-control" id="filmName" placeholder="Enter film name" name="filmname" required>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="releaseDate">Release Date</label>
                                    <input type="date" class="form-control" id="releaseDate" pattern="yyyy-mm-dd" name="releasedate">
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="description">Description</label>
                                <textarea class="form-control" id="description" rows="3" name="description"></textarea>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="linkImg">Link Image</label>
                                    <input type="text" class="form-control" id="linkImg" placeholder="Enter image link" name="linkimg1" required>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="linkTrailer">Link Trailer</label>
                                    <input type="text" class="form-control" id="linkTrailer" placeholder="Enter trailer link" name="linktrailer" required>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label for="country">Country</label>
                                    <select class="form-control" id="country" name="country" required>
                                        <option value="">Select country</option>
                                        <c:forEach items="${listcountry}" var="country">
                                            <option value="${country.countryId}">${country.countryName}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="genre">Genre</label>
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <c:forEach items="${listgenre}" var="genre" begin="0" end="5">
                                                <div class="form-check">
                                                    <input class="form-check-input" type="checkbox" id="genre${genre.genreId}" value="${genre.genreId}" name="genre">
                                                    <label class="form-check-label" for="genre${genre.genreId}">
                                                        ${genre.genreName}
                                                    </label>
                                                </div>
                                            </c:forEach>
                                        </div>
                                        <div class="col-sm-4">
                                            <c:forEach items="${listgenre}" var="genre" begin="6" end="12">
                                                <div class="form-check">
                                                    <input class="form-check-input" type="checkbox" id="genre${genre.genreId}" value="${genre.genreId}" name="genre">
                                                    <label class="form-check-label" for="genre${genre.genreId}">
                                                        ${genre.genreName}
                                                    </label>
                                                </div>
                                            </c:forEach>
                                        </div>
                                        <div class="col-sm-4">
                                            <c:forEach items="${listgenre}" var="genre" begin="13">
                                                <div class="form-check">
                                                    <input class="form-check-input" type="checkbox" id="genre${genre.genreId}" value="${genre.genreId}" name="genre">
                                                    <label class="form-check-label" for="genre${genre.genreId}">
                                                        ${genre.genreName}
                                                    </label>
                                                </div>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="form-row">
                                <div class="form-group col-md-6">
                                    <label>Type</label>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="filmType" id="tvSeries" value="tvSeries">
                                        <label class="form-check-label" for="tvSeries">
                                            TV-Series
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" name="filmType" id="singleFilm" value="singleFilm">
                                        <label class="form-check-label" for="singleFilm">
                                            Single Film
                                        </label>
                                    </div>
                                </div>
                                <div class="form-group col-md-6">
                                    <label for="linkImg2">Link Image 2</label>
                                    <input type="text" class="form-control" id="linkImg2" placeholder="Enter second image link" name="linkimg2" required>
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                            <button type="submit" class="btn btn-primary">Add Film</button>
                            <button type="reset" class="btn btn-danger">Reset</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>   

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