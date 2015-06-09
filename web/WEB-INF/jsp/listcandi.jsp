<%-- 
    Document   : listcandi
    Created on : 8 Jun, 2015, 1:10:14 AM
    Author     : Swarnendu
--%>

<<h4> CANDI </h4>
<center>
         <table  border=".2" style="border: 5; color: crimson">
            <thead style="color: blue">
            <th>JOBID</th>
            <th>JOB NAME</th>
            <th>JOB DESCRIPTION</th>
            <th>APPLY</th>
            </thead>
           
        <c:forEach items="${jobs}" var="l">
            <tr>
        <td>${l.appid}</td>
        <td>${l.name}</td>
        <td>${l.email}</td>  
        <td><a href="applyJob.nw?jid=" onclick="return popitup('applyJob.nw?jid=')">Apply</a></td>
            </tr>
        </c:forEach>
        </table>
    
</center>
<script language="javascript" type="text/javascript">
<!--
function popitup(url) {
	newwindow=window.open(url,'name','height=880,width=750');
	if (window.focus) {newwindow.focus()}
	return false;
}

// -->
</script>