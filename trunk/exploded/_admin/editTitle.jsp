<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title></title></head>
  <body>
  <html:form action="/manageEntries">

    <html:text property="title" name="entryToEdit" size="50" />
    <br/>
    <html:text property="contentDate" name="entryToEdit" size="50"/>
    <br/>
    <html:textarea property="content" name="entryToEdit" cols="60" rows="50"/><br/>
    <html:radio property="viewable" name="entryToEdit" value="bling"/>
    <html:radio property="viewable" name="entryToEdit" value="bling" />
    <br/>
    <html:submit value="Save"/>
    <br/>
</html:form>
  </body>
</html>