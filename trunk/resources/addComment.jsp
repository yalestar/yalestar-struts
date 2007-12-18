<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <html:base/>
    <title>Comment addifier</title></head>
<body>

<table cellpadding=0 cellspacing=0 border=0 align="center">

    <html:form action="/addComment" onsubmit="javascript:window.close();">
        <tr>
            <td valign="middle" class="text" align="right">
                <strong>Name:</strong>
            </td>
            <td width=10 class="text">&nbsp;</td>
            <td valign="top" class="text">
                <html:text property="name" size="40"/>
            </td>
        </tr>
        <tr>
            <td valign="middle" class="text" align="right">
                <strong>Email:</strong>
            </td>
            <td width=10 class="text">&nbsp;</td>
            <td valign="top" class="text">
                    <html:text property="email" size="40"/>
        </tr>

        <tr>
            <td class="text" valign="top"><strong>Comment:</strong></td>
            <td width=10 class="text">&nbsp;</td>
            <td class="text">
                    <html:textarea property="comment" cols="50" rows="10"
                                   styleClass="text"/>
        </tr>
        <tr>
            <td colspan=3 align="center" valign="top" class="text">
                <br/><br/>
                <html:submit value="Submit"/>

                <input type="hidden" name="ID"
                        value="<%= request.getParameter("ID")%>"/> <br/><br/> <a
                    href="javascript:window.close();">Close Window</a>
            </td>
        </tr>
    </html:form>
</table>
</body>
</html>