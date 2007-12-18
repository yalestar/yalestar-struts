package com.yalestar.model;

import java.util.ArrayList;
import java.util.Date;

public class Entry {

    /*
        ContentID	int
        ID	varchar
        ContentDate	date
        Content	longtext
        Viewable	tinyint
        Title	varchar
     */
    private String content;

    private String contentID;

    private String ID;

    private Date lastEditDate;

    private Date contentDate;

    private boolean viewable;

    private String title;

    private ArrayList comments;


    public Entry(String content,
                 String contentID,
                 String ID,
                 String title,
                 Date contentDate,
                 boolean viewable,
                 ArrayList comments) {

        this.content = content;
        this.contentID = contentID;
        this.title = title;
        this.ID = ID;
        this.contentDate = contentDate;
        this.viewable = viewable;
        this.comments = comments;
    }


    public Entry(String content, String contentID, String entryID, String title,
                 Date contentDate, boolean viewable) {

        this.content = content;
        this.contentID = contentID;
        this.title = title;
        this.ID = ID;
        this.contentDate = contentDate;
        this.viewable = viewable;
    }


    public Entry() {

    }


    public ArrayList getComments() {
        return comments;
    }


    public void setComments(ArrayList comments) {
        this.comments = comments;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public String getContentID() {
        return contentID;
    }


    public void setContentID(String contentID) {
        this.contentID = contentID;
    }


    public String getID() {
        return ID;
    }


    public void setID(String ID) {
        this.ID = ID;
    }


    public Date getLastEditDate() {
        return lastEditDate;
    }


    public void setLastEditDate(Date lastEditDate) {
        this.lastEditDate = lastEditDate;
    }


    public Date getContentDate() {
        return contentDate;
    }


    public void setContentDate(Date contentDate) {
        this.contentDate = contentDate;
    }


    public boolean isViewable() {
        return viewable;
    }


    public void setViewable(boolean viewable) {
        this.viewable = viewable;
    }
}
