package com.yalestar.controller.form;

import org.apache.struts.action.ActionForm;

public class EditEntryForm extends ActionForm {

    private String titleText;
    private String content;
    private int contentID;
    private String contentDate;
    private String viewable;


    public EditEntryForm(String titleText, String entryText, String entryDate,
                         String viewable) {
        this.titleText = titleText;
        this.content = entryText;
        this.contentDate = entryDate;
        this.viewable = viewable;
    }


    public EditEntryForm() {
    }


    public int getContentID() {
        return contentID;
    }


    public void setContentID(int contentID) {
        this.contentID = contentID;
    }


    public String getTitleText() {
        return titleText;
    }


    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public String getContentDate() {
        return contentDate;
    }


    public void setContentDate(String contentDate) {
        this.contentDate = contentDate;
    }


    public String getViewable() {
        return viewable;
    }


    public void setViewable(String viewable) {
        this.viewable = viewable;
    }
}
