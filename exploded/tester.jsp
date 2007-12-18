<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title></title></head>
<body>

<html:form action="/showComments">
    <html:submit onclick="set('save');">save</html:submit>
    <html:submit onclick="set('create');">save as new</html:submit>
    <html:submit onclick="set('delete);">delete</html:submit>
</html:form>
</body>
</html>