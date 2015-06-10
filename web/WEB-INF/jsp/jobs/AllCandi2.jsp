<%-- 
    Document   : AllCandi2
    Created on : 8 Jun, 2015, 10:31:38 PM
    Author     : Swarnendu
--%>

<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="well">
<center>
<div class="col-lg-12">
    <div class="panel panel-default">
        <div class="panel-heading">
            <a href="#"> DataTables Advanced Tables </a>
             <button onclick="printContent('rec')">Print Content</button>
        </div>
        <!-- /.panel-heading -->
        <div class="panel-body" id="rec">
            <div class="dataTable_wrapper">
                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                    <thead>
                        <tr>
                            <th>JOBID</th>
                            <th>JOB NAME</th>
                            <th>JOB DESCRIPTION</th>
                            <th>APPLY</th>
                        </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${jobs}" var="l">
                        <tr Class="odd gradeX">
                            <td>${l.aid}</td>
                            <td>${l.name}</td>
                            <td>${l.email}</td>  
                            <td><a href="applyJob.nw?jid=" onclick="return popitup('applyJob.nw?jid=')">Apply</a></td>
                        </tr>
                    </c:forEach> 

                    </tbody>
                </table>
            </div>
           
            <!-- /.table-responsive -->
            <div class="well">
                <h4>DataTables Usage Information</h4>
                <p>DataTables is a very flexible, advanced tables plugin for jQuery. In SB Admin, we are using a specialized version of DataTables built for Bootstrap 3. We have also customized the table headings to use Font Awesome icons in place of images. For complete documentation on DataTables, visit their website at <a target="_blank" href="https://datatables.net/">https://datatables.net/</a>.</p>
                <a class="btn btn-default btn-lg btn-block" target="_blank" href="https://datatables.net/">View DataTables Documentation</a>
            </div>
        </div>
        <!-- /.panel-body -->
    </div>
    <!-- /.panel -->
</div>
</center>
</div>


<script>
function printContent(el){
	var restorepage = document.body.innerHTML;
	var printcontent = document.getElementById(el).innerHTML;
	document.body.innerHTML = printcontent;
	window.print();
	document.body.innerHTML = restorepage;
}
</script>
