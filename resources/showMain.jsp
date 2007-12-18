<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html:html xhtml="false">
<head>
    <html:base/>
    <link rel="icon" type="image/png" href="">
    <title>Starbelly Slim</title>
    <link rel="stylesheet" href="/css/yalestar.css">
</head>
<script type="text/javascript">
    function pop(url) {
        var winParams = "fullscreen=no" + ",location=no" + ",menubar=no" + ",titlebar=no" + ",toolbar=no" + ",Status=no" + ",resizable=yes" + ",height=350" + ",width=550";
        var newWindow = window.open(url, '_blank', winParams);
        newWindow.focus()
    }
</script>
<body>

<div id="wrapper">
<div id="top2">
    <div id="banner">
        <h1>GNU's Not Unix!</h1>

        <div id="gnulogo"><a href=""><img src="" alt=""></a></div>

    </div>
    <div id="navigation-bar">
        <div id="navbar">
            <ul>
                <li><a href="/egg/showMain">Main</a></li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>

                <li><a href="/egg/archives">Archives</a></li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>

                <li><a href="/egg/bios">Bio-hagiography</a></li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>

                <li><a href="/egg/rss">RSS</a></li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>

                <li><a href="/egg/reviews">Reviews</a></li>
                <li>&nbsp;</li>
                <li>&nbsp;</li>

                <li><a href="/egg/articles">Articles</a></li>
            </ul>
        </div>
    </div>
</div>
<div id="columns">
<div class="content">


    <logic:notPresent name="mainEntries">
        <h1><p>'anotherTestBean' is not present.</p></h1>
    </logic:notPresent>

    <logic:present name="mainEntries">
        <logic:iterate id="entry" name="mainEntries"
                       type="com.yalestar.model.Entry">

            <p class="entryTitle">
                <bean:write name="entry" property="title"/>
            </p>

            <p class="entryDate">
                <bean:write name="entry" property="contentDate"/>
            </p>
            <!-- TODO: replace all rows of = with hr -->
            <p class="content">
                <bean:write name="entry" property="content" filter="false"/>
            </p>
            <jsp:useBean id="params" class="java.util.HashMap"
                         scope="page"/>

            <% params.put("r", new Integer(entry.getComments().size()));
            %>COMMENTS: <a href="<bean:write name="entry" property="ID"/>">
            <%= "(" + params.get("r") + ")"%>
        </a> | <a
                href="javascript:pop('/addComment.jsp?ID=<bean:write name="entry" property="ID"/>');">ADD
            COMMENT
        </a>

            <br/><br/>
        </logic:iterate>
    </logic:present>

</div>
<div id="sidebar">

    <h3>more yalestar spew</h3>
    <ul>
        <li><a href="/egg/archives">Archives (back to Feb '01)</a></li>
        <li><a href="/egg/articles">Articles I've Writ</a></li>
        <li><a href="/egg/bios">Memoirs</a></li>
        <li><a href="http://www.oliviakaul.org">Young'uns' Site</a></li>
        <li><a href="/egg/bandnames">Archive of Royalty-Free Bandnames</a></li>
        <li><a href="/egg/lists">Lists</a></li>
        <li><a href="/egg/contact">Contact</a></li>
    </ul>

    <br/>

    <!-- TODO: unhardcode these -->
    <h3>external goodness</h3>
    <logic:notPresent name="links">
        <h1><p>links no es present.</p></h1>
    </logic:notPresent>

    <logic:present name="links">
        <ul>
            <logic:iterate id="l" name="links" type="com.yalestar.model.Link">
                <li><a href="<bean:write name="l" property="linkURL"></bean:write>"><bean:write name="l" property="linkName" filter="false"></bean:write></a>

            </logic:iterate>
        </ul>
    </logic:present>

    <br/>

    <h3>For developers</h3>
    <ul>
        <li><a href="">Development projects</a>
        </li>
        <li><a href="">Developer resources</a>
        </li>
    </ul>

    <div>
        <h3>Support the FSF</h3>

        <div style="margin: 1.5em;
            padding: 0.5em;
            text-align:center;
            background-color: white;">

            <p><a href=""><img src="" alt=""></a></p>

            <p><a href=""><strong>Join the FSF today!</strong></a></p>

            <p><a href=""><img src="" alt=""></a></p>

            <p><a href="">Donate to the FSF today!</a></p>

        </div>

    </div>


    <img src="/images/struts-power.gif" alt=""/>

</div>
</div>

<div id="footer">
    <p>runs fairly reliably using Struts, iBATIS, and JSTL on a Resin server
    </p>

</div>
</div>
</body>
</html:html>