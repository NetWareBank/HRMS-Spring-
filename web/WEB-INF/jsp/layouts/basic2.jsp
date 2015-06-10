<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
 <html class="no-js"> <!--<![endif]-->
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>NetWare JobBench</title>
<meta name="description" content="Simple Responsive Template is a template for responsive web design. Mobile first, responsive grid layout, toggle menu, navigation bar with unlimited drop downs, responsive slideshow">
<meta name="keywords" content="">

<!-- Mobile viewport -->
<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=yes">

<link rel="shortcut icon" href="<c:url value="/resources/images/nw.png"/>"  type="image/x-icon">

<!-- CSS-->
<!-- Google web fonts. You can get your own bundle at http://www.google.com/fonts. Don't forget to update the CSS accordingly!-->
<link href='http://fonts.googleapis.com/css?family=Droid+Serif|Ubuntu' rel='stylesheet' type='text/css'>

<link rel="stylesheet" href="<c:url value="/resources/css/normalize.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/js/flexslider/flexslider.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/basic-style.css"/>">

<!-- end CSS-->
    
<!-- JS-->
<script src="<c:url value="/resources/js/libs/modernizr-2.6.2.min.js"/>"></script>
<!-- end JS-->


<!-- columns demo style. DELETE IT! -->
<style type="text/css">
<!--

#columnsdemo .grid_1,
#columnsdemo .grid_2,
#columnsdemo .grid_3,
#columnsdemo .grid_4,
#columnsdemo .grid_5,
#columnsdemo .grid_6,
#columnsdemo .grid_7,
#columnsdemo .grid_8,
#columnsdemo .grid_9,
#columnsdemo .grid_10,
#columnsdemo .grid_11,
#columnsdemo .grid_12 {
border: solid 1px #999;
color:#999;
text-align: center;
margin-top:20px;
padding:20px 15px;
}
-->
</style>
</head>

<body id="home">
  
<!-- header area -->
    <header class="wrapper clearfix">
		       
        <div id="banner">        
            <div id="logo"><a href="#"><img src="<c:url value="/resources/images/logon.png"/>"></a></div> 
        </div>
        
        <!-- main navigation -->
        <nav id="topnav" role="navigation">
          <div class="menu-toggle">Menu</div>  
          <ul class="srt-menu" id="menu-main-navigation">
              <li class="current"><a href="/">Home page</a></li>
              <li><a href="#">EMAIL</a></li>
              <li><a href="#">menu item 3</a>
                  <ul>
                      <li>
                          <a href="#">menu item 3.1</a>
                      </li>
                      <li class="current">
                          <a href="#">menu item 3.2</a>
                          <ul>
                              <li><a href="#">menu item 3.2.1</a></li>
                              <li><a href="#">menu item 3.2.2 with longer link name</a></li>
                              <li><a href="#">menu item 3.2.3</a></li>
                              <li><a href="#">menu item 3.2.4</a></li>
                              <li><a href="#">menu item 3.2.5</a></li>
                          </ul>
                      </li>
                      <li><a href="#">menu item 3.3</a></li>
                      <li><a href="#">menu item 3.4</a></li>
                  </ul>
              </li>
              <li>
                  <a href="#">menu item 4</a>
                  <ul>
                      <li><a href="#">menu item 4.1</a></li>
                      <li><a href="#">menu item 4.2</a></li>
                  </ul>
              </li>
              <li>
                  <a href="#">menu item 5</a>
              </li>	
          </ul>     
		</nav><!-- end main navigation -->
  
    </header><!-- end header -->
 
 
<!-- hero area (the grey one with a slider -->
    <section id="hero" class="clearfix">    
    <!-- responsive FlexSlider image slideshow -->
    <div class="wrapper">
       <div class="row"> 
        <div class="grid_5">
           
            
            <p><a href="#" class="buttonlink">CALL TO ACTION</a> <a href="#" class="buttonlink">ONE MORE</a></p>
           
        </div>
        <div class="grid_7 rightfloat">
              
              </div><!-- end grid_7 -->
        </div><!-- end row -->
       </div><!-- end wrapper -->
    </section><!-- end hero area -->





<!-- main content area -->   
<div id="main" class="wrapper">
    
     <tiles:insertAttribute name="body" />
<!-- content area -->    
	<section id="content" class="wide-content">
      
        
        <!-- end row -->
	</section><!-- end content area -->   
      
      
    <!-- columns demo, delete it!-->
    
   
    <!-- end columns demo -->  
    
      
  </div><!-- #end div #main .wrapper -->


<!-- footer area -->    
<footer>
	<div id="colophon" class="wrapper clearfix">
    	NetWare
    </div>
    
<!--You can NOT remove this attribution statement from any page, unless you get the permission from prowebdesign.ro--><div id="attribution" class="wrapper clearfix" style="color:#666; font-size:11px;">Site built with <a href="#" style="color:#777;">JOB BENCH </a></div><!--end attribution-->
    
</footer><!-- #end footer area --> 


<!-- jQuery -->
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="js/libs/jquery-1.9.0.min.js">\x3C/script>')</script>

<script defer src="js/flexslider/jquery.flexslider-min.js"></script>

<!-- fire ups - read this file!  -->   
<script src="js/main.js"></script>

</body>
</html>