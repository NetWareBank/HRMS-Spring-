<%-- 
    Document   : employee_menu
    Created on : 9 Jun, 2015, 5:11:17 PM
    Author     : Swarnendu
--%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<center>
    <div class="panel-body">
        <div class="table-responsive">
            <table >
                <tr>
                    <td> <a href="addNewEmp.nw" class="btn btn-success" onclick="return popitup('addNewEmp.nw')">ADD-EMPLOYEE</a> </td>
                    <td>||</td>
                    <td><a href="addNewEmp.nw" class="btn btn-primary" onclick="return popitup('allEmp.nw')">ALL-EMPLOYEE</a> </td>
                    <td>||</td>
                    <td><a href="addNewEmp.nw" class="btn btn-warning" onclick="return popitup('addNewDep.nw')">ADD-DEPARTMENT</a> </td>
                    <td>||</td>
                    <td><a href="addNewEmp.nw" class="btn btn-info" onclick="return popitup('allDep.nw')">ALL-DEPARTMENT</a> </td>
                </tr>
            </table>
        </div>
</center>

<script language="javascript" type="text/javascript">
<!--
function popitup(url) {
	newwindow=window.open(url,'name','height=3080,width=750');
	if (window.focus) {newwindow.focus()}
	return false;
}

// -->
</script>