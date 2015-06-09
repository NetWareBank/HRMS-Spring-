<%-- 
    Document   : hrpostjob
    Created on : 3 Jun, 2015, 12:57:44 PM
    Author     : Swarnendu
--%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<h4 style="color: #04B173"> POST JOB IN JOB-PULL </h4>


<center>
    <div class="table-responsive">
        <f:form action="hrJobPost.nw" modelAttribute="jobpull">
        <table class="">
            <tr>
                <td>JOB FOR POSITION</td>
                <td><input type="text" required="required" name="jname" placeholder="JOB POS"/></td>
            </tr>
            <tr>
                <td>JOB Role</td>
                <td><input type="text" required="required" name="jobdesc" placeholder="JOB ROLE"/></td>
            </tr>
            <tr>
                <td>STATUS</td>
                <td><input type="text" required="required" name="jobStatus" placeholder="JOB POS"/></td>
            </tr>
            <tr>
                <td><h5 style="color: #0099ff"><b>${msg}</h5></td>
                <td><input type="submit" value="SAVE"/></td>
            </tr>
        </table>
        </f:form>
    </div>
</center>