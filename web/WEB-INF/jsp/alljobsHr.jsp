<%-- 
    Document   : allJobs
    Created on : 1 Jun, 2015, 9:21:55 PM
    Author     : Swarnendu
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<center>


<center>
    <div class="col-lg-12">
        <div class="panel panel-default">
            <div class="panel-heading">
                DataTables Advanced Tables
            </div>
            <!-- /.panel-heading -->
            <div class="panel-body">
                <div class="dataTable_wrapper">
                    <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                        <thead>
                            <tr>
                                <th>JOBID</th>
                                <th>JOB NAME</th>
                                <th>JOB DESCRIPTION</th>
                                <th>Delete</th>
                                <th>Edit</th>
                            </tr>
                        </thead>
                        <tbody>

                            <c:forEach items="${jobs}" var="l">
                                <tr>
                                    <td>${l.jobid}</td>
                                    <td>${l.jname}</td>
                                    <td>${l.jobdesc}</td>  
                                    <td><a href="delJob.nw?jid=${l.jobid}" onclick="return popitup('#')">Delete</a></td>
                                    <td><a href="delJob.nw?jid=${l.jobid}" onclick="return popitup('#')">EDIT</a></td>
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


<script language="javascript" type="text/javascript">
            <!--
            function popitup(url) {
                newwindow = window.open(url, 'name', 'height=880,width=750');
                if (window.focus) {
                    newwindow.focus()
                }
                return false;
            }

            // -->
        </script>