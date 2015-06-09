<%@taglib  uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<center>
    <f:form action="hrrStateAddperform.nw" modelAttribute="state">
        <input type="text" required="required" placeholder="ENTER STATE NAME" name="state_name"/>
        <input type="submit" value=" SAVE"/>
    </f:form>
        <p>${msg}</p>
</center>