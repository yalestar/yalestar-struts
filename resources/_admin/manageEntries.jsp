<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/_admin/css/adminCSS.css"/>
    <html:base/>
    <title>uuuuu</title></head>
<body>

<table class="stats" width="500" cellspacing="0">
    <tr>
        <td class="hed">Title</td>
        <td class="hed">Date</td>
        <td class="hed">Viewable</td>
        <td class="hed" colspan="2">Action</td>
        <td class="hed" colspan="2">bloogie</td>
    </tr>
    <logic:iterate id="entryID" name="entries" indexId="yang">
        <tr>
            <td>
                <bean:write name="entryID" property="title"/>
            </td>
            <td>
                <bean:write name="entryID" property="contentDate"
                            format="MM-dd-yyyy"/>
            </td>
            <td>
                <logic:match property="viewable" name="entryID" value="true">
                    <html:image src="/images/checkbox_icon.gif"/>
                </logic:match>
                <logic:match value="false" name="entryID"
                             property="viewable">
                    <c:out value="untrue"/>
                </logic:match>
            </td>
            <td>
                <a href="/editEntryAction.do?step=edit&cid=<bean:write name="entryID" property="contentID"/>">Modify </a>
            </td>
            <td>
                <a href="/editEntryAction.do?step=delete&cid=<bean:write name="entryID" property="contentID"/>">Delete </a>
            </td>
            <td>
                <bean:write name="entryID" property="contentID"/>
            </td>

        </tr>
    </logic:iterate>
</table>
</body>
</html>