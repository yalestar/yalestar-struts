<%@ taglib prefix="html" uri="http://struts.apache.org/tags-html" %>
<%@ taglib prefix="bean" uri="http://struts.apache.org/tags-bean" %>
<%@ taglib prefix="logic" uri="http://struts.apache.org/tags-logic" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title></title></head>
<body>

fart!
<logic:notPresent name="allBandnames">
    <h4><p>'Bean' is not present.</p></h4>
</logic:notPresent>
<logic:present name="allBandnames">
    <logic:iterate id="bn" name="allBandnames" type="com.yalestar.model.Bandname">

        <p class="entryTitle">
            <bean:write name="bn" property="author"/>
        </p>

        <p class="entryDate">
            <bean:write name="bn" property="bandnames"/>
        </p><br/><br/>
    </logic:iterate>
</logic:present>
</body>
</html>