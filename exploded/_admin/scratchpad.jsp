<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title></title></head>
<body>

<html:form action="">


    <tr>
        <td class="text">
                <%--<html:textarea property="spiel" />--%>
            <textarea cols=50 rows=10 name="Message" class="text"></textarea></td>
    </tr>
    <tr>
        <td>&nbsp;</td>
    </tr>
    <tr>
        <td>
            <html:submit value="Save"/>
        </td>
    </tr>

    <tr>
        <td>&nbsp;</td>
    </tr>

    <tr>
        <td class="text">Last Updated:</td>
    </tr>
</html:form>

</body>
</html>