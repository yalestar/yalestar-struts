package com.yalestar.model;

import java.util.Date;

public class Article {

    private int UID;
    private String content;
    private Date addDate;


    public int getUID() {
        return UID;
    }


    public void setUID(int UID) {
        this.UID = UID;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }


    public Date getAddDate() {
        return addDate;
    }


    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
}
