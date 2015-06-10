<%@taglib  uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<center>
    <f:form action="hrdistform.nw" modelAttribute="district">
        <input type="text" required="required" placeholder="ENTER DISTRICT NAME" name="dist_name"/>
        <input type="submit" value=" SAVE"/>
    </f:form>
        <p style="color: #04B173"><b>${msg}</b></p>
</center>