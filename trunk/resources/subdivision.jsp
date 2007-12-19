<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head><title></title></head>
<body>

<table width=98% border="0" cellspacing="1" cellpadding="1">

    <logic:notPresent name="subdivision">
        <h1><p>subdivision es no presente</p></h1>
    </logic:notPresent>

    <logic:present name="subdivision">
        <tbody>
            <tr>
                <td align="center"><img src="/images/sd/head.gif" alt=""></td>
            </tr>
            <tr>

                <td align="center">
                    <logic:empty name="subdivision" property="img">
                        dinglasdfasdfasfdasdfasd
                    </logic:empty>
                    <img src="<bean:write name="subdivision" property="img" />" alt=""></td>
            </tr>
            <tr>
                <td align="center"><i>
                    <bean:write name="subdivision" property="part1"/>
                    <bean:write name="subdivision" property="part2"/>
                    <bean:write name="subdivision" property="part3"/>

                </i></td>
            </tr>
            <tr>
                <td align="center"><br><b><a href="/egg/subdivision" target="_self">Gimme another!
                    It just keeps getting funnier!</a></b></td>
            </tr>
            <tr>
                <td align="center"><br><a href="/subdinfo.html" target="_self">Info & Commentary</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a
                        href="javascript:history.back()"> << Back </a></td>
            </tr>
        </tbody>

    </logic:present>

</table>
<hr>

</body>
</html>