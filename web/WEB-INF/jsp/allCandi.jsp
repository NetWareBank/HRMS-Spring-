<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="<c:url value="/resources/GRID/css/demo_page.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/GRID/css/demo_table.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/GRID/css/demo_table_jui.css"/>" rel="stylesheet" />
<link href="<c:url value="/resources/GRID/css/jquery-ui-1.8.24.custom.css"/>" rel="stylesheet" />
<script src="<c:url value="/resources/GRID/js/jquery-min.js"/>" type="text/javascript"></script>
<script src="<c:url value="/resources/GRID/js/jquery.dataTables.js"/>" type="text/javascript"></script>

<h4> CANDI </h4>
<center>
   

<div class="table-responsive">
    <table id="sales" class="display">
        <thead style="color: blue">
        <th>JOBID</th>
        <th>JOB NAME</th>
        <th>JOB DESCRIPTION</th>
        <th>APPLY</th>
        </thead>

        <c:forEach items="${jobs}" var="l">
            <tr>
                <td>${l.aid}</td>
                <td>${l.name}</td>
                <td>${l.email}</td>  
                <td><a href="applyJob.nw?jid=" onclick="return popitup('applyJob.nw?jid=')">Apply</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</center>
<script language="javascript" type="text/javascript">
<!--
    function popitup(url) {
        newwindow = window.open(url, 'name', 'height=880,width=750');
        if (window.focus) {
            newwindow.focus()
        }
        return false;
    }
var j = jQuery.noConflict();
    j(document).ready(function () {

        j("#sales").DataTable({
            "sPaginationType": "full_numbers",
            "bJQueryUI": true

        });

    });

// -->
</script>