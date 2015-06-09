<%-- 
    Document   : menu_popitup
    Created on : 9 Jun, 2015, 5:57:37 PM
    Author     : Swarnendu
--%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="f"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <link href="<c:url value="/resources/bower_components/bootstrap/dist/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<c:url value="/resources/bower_components/metisMenu/dist/metisMenu.min.css"/>" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="/resources/dist/css/sb-admin-2.css"/>" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<c:url value="/resources/bower_components/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title style="color: #04B173">NetWare@MENU</title>
        
        
        
    </head>
    <body>
       
    <center>
        <div class="wrapper">
         <h3 style="color: #04B173">NewWare</h3>
         <tiles:insertAttribute name="body" />
        </div>
    </center>
      <script language="javascript" type="text/javascript">
<!--
function popitup(url) {
	newwindow=window.open(url,'name','height=880,width=750');
	if (window.focus) {newwindow.focus()}
	return false;
}


function popmenu(url) {
	newwindow=window.open(url,'name','height=400,width=900');
	if (window.focus) {newwindow.focus()}
	return false;
}

// -->
</script>
<script src="<c:url value="/resources/bower_components/datatables/media/js/jquery.dataTables.js"/>"></script>
<script src="<c:url value="/resources/bower_components/DataTables/media/js/jquery.dataTables.min.js"/>"></script>
    <script src="<c:url value="/resources/bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"/>"></script>
    
    
    </body>
</html>
