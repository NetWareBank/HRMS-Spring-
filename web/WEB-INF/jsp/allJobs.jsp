<%-- 
    Document   : allJobs
    Created on : 1 Jun, 2015, 9:21:55 PM
    Author     : Swarnendu
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <center>
<div style=" width: 500px; height: 500px; animation: ease-in; ">
   
        <h1>NetWare</h1>
        <h4> ALL JOB LISTING </h4>
        
         <table  border=".2" style="border: 5; color: crimson">
            <thead style="color: blue">
            <th>JOBID</th>
            <th>JOB NAME</th>
            <th>JOB DESCRIPTION</th>
            <th>APPLY</th>
            </thead>
           
        <c:forEach items="${jobs}" var="l">
            <tr>
        <td>${l.jobid}</td>
        <td>${l.jname}</td>
        <td>${l.jobdesc}</td>  
        <td><a href="applyJob.nw?jid=${l.jobid}" onclick="return popitup('applyJob.nw?jid=${l.jobid}')">Apply</a></td>
            </tr>
        </c:forEach>
        </table>
    <script language="javascript" type="text/javascript">
<!--
function popitup(url) {
	newwindow=window.open(url,'name','height=3080,width=750');
	if (window.focus) {newwindow.focus()}
	return false;
}

// -->
</script>
</div>
</center>