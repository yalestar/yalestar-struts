package com.yalestar.controller.form;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;

public class NewCommentForm extends ActionForm {

    private String name;

    private String email;

    private String ipAddress;

    private String comment;

    private String entryID;


    public ActionErrors validate(ActionMapping mapping,
                                 HttpServletRequest request) {

        ActionErrors errors = new ActionErrors();

        String name = getName();
        String email = getEmail();
        String comment = getComment();


        return null;
    }


    public NewCommentForm(String name,
                          String email,
                          String comment,
                          String entryID) {
        this.name = name;
        this.email = email;
        this.comment = comment;
        this.entryID = entryID;
    }


    public NewCommentForm() {
    }


    public String getEntryID() {
        return entryID;
    }


    public void setEntryID(String entryID) {
        this.entryID = entryID;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getIpAddress() {
        return ipAddress;
    }


    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    public String getComment() {
        return comment;
    }


    public void setComment(String comment) {
        this.comment = comment;
    }
}
