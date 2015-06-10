<%-- 
    Document   : filljob
    Created on : 1 Jun, 2015, 9:52:58 PM
    Author     : Swarnendu
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>


<style>
    .required input:after { content:"*"; }
</style>

<center>
   
                                                                 
    <h5 style="color: #D14"> Fill up the form applying for JobID : --  ${jobid} ---  </h5>
<f:form action="apply.nw" modelAttribute="applicant">
        <h4 style="color: #04B173">${msg}</h4>

        <table border="0" >
            
            <input type="hidden" value="${jobid}" name="applyfor"/>
            <tr style="color: #04B173">
            <td><input  id="name" type="text" name="name" required="required" placeholder="NAME" style="color: #04B173"></td></tr>
        
        <tr>
            <td><input id="email"  name="email" type="email"  required="required" placeholder="EMAIL ID" style="color: #D14" ><td>
        </tr>
        
         <tr>
            <td><input id="total-experience" name="totex" type="text"  required="required" placeholder="TOTAL EXPERIENCE"><td>
        </tr>
        <tr>
            <td><textarea id="address" name="desc" rows="15" cols="70" required="required" placeholder="RESUME COPY HERE" style="color: #0063DC"></textarea></td>
        </tr>
        
        <tr>
            <td><input  name="phno"  pattern="[0-9]{10,10}" type="number" maxlength="10"  autocomplete="off"  required="required" placeholder="phone number"><td>
        </tr>
       
         <tr>
             <td><input type="submit" value="OK"><td>
        </tr>
        </table>
    </f:form>
</center>


<script>
    var createAllErrors = function() {
        var form = $( this ),
            errorList = $( "ul.errorMessages", form );

        var showAllErrorMessages = function() {
            errorList.empty();

            // Find all invalid fields within the form.
            var invalidFields = form.find( ":invalid" ).each( function( index, node ) {

                // Find the field's corresponding label
                var label = $( "label[for=" + node.id + "] "),
                    // Opera incorrectly does not fill the validationMessage property.
                    message = node.validationMessage || 'Invalid value.';

                errorList
                    .show()
                    .append( "<li><span>" + label.html() + "</span> " + message + "</li>" );
            });
        };

        // Support Safari
        form.on( "submit", function( event ) {
            if ( this.checkValidity && !this.checkValidity() ) {
                $( this ).find( ":invalid" ).first().focus();
                event.preventDefault();
            }
        });

        $( "input[type=submit], button:not([type=button])", form )
            .on( "click", showAllErrorMessages);

        $( "input", form ).on( "keypress", function( event ) {
            var type = $( this ).attr( "type" );
            if ( /date|email|month|number|search|tel|text|time|url|week/.test ( type )
              && event.keyCode == 13 ) {
                showAllErrorMessages();
            }
        });
    };

    $( "form" ).each( createAllErrors );
</script>
