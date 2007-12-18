var browserName = navigator.appName;

if (browserName == "Microsoft Internet Explorer") {
    if (document.selection) {
        document.write('<span class="signature"><p><b>Formatting:</b> Highlight your text then click to <A title="Make a Link" href="javascript:ahrefThis();" target=_self><img src="link.gif"></A>, <A title=Bold href="javascript:boldThis();" target=_self><img src="bold.gif"></A> or <A title=Italicize href="javascript:italicThis();" target=_self><img src="italic.gif"></A></p></span>')
    }


    function ahrefThis() {
        var strSelection = document.selection.createRange().text
        if (strSelection == "") document.text.text.focus()
        strHref = prompt("Enter (or paste) the URL of the site:", "http://")
        if (strHref == null) return;
        document.selection.createRange().text =
        "<a href=\"" + strHref + "\" target=\"_blank\" class=\"text\">" + strSelection + "</a> "

    }

    function boldThis(from) {
        var strSelection = document.selection.createRange().text
        if (strSelection == "") {
            document.text.text.focus()
            if (from == 2) document.text.text.select()
            strSelection = document.selection.createRange().text
            document.selection.createRange().text = strSelection + "<b></b>"
        } else document.selection.createRange().text =
               "<b>" + strSelection + "</b> "
    }

    function clipThis(from) {
        var strSelection = document.selection.createRange().text;
        document.text.text.focus();
        var dummy = document.text.text.value;
        document.text.text.value = "";
        if (dummy) {
            document.selection.createRange().text =
            dummy + "\n\n<i>" + strSelection + "</i> ";
        } else {
            document.selection.createRange().text =
            "<i>" + strSelection + "</i> ";
        }

    }

    function italicThis(from) {
        var strSelection = document.selection.createRange().text
        if (strSelection == "") {
            document.text.text.focus()
            if (from == 2) document.text.text.select()
            strSelection = document.selection.createRange().text
            document.selection.createRange().text = strSelection + "<i></i>"
        } else document.selection.createRange().text =
               "<i>" + strSelection + "</i> "

    }
} else {
    document.write('<td class="text"><b>Italics: </b>&lt;i&gt;Your Text&lt;/i&gt;<br><b>Bold:</b> &lt;b&gt;Your Text&lt;/b&gt;<br><b>Link:</b> &lt;a \href="URL Goes Here (w/quotes)"&gt;Linked Text&lt;/a&gt;</td>')
}
