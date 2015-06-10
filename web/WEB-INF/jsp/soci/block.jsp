<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<h3>BLOCK </h3>
<center>
    <f:form action="hrblockform.nw" modelAttribute="block">
        <input type="text" required="required" placeholder="ENTER BLOCK NAME" name="block_name"/>
        <select name="district_name">
            <option>SELECT DISTRICT</option>
            <c:forEach items="${lst}" var="ds">
                <option>${ds.dist_name}</option>
            </c:forEach>
            
        </select>
        <input type="submit" value=" SAVE"/>
    </f:form>
        <p style="color: #04B173"><b>${msg}</b></p>
</center>