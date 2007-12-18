package com.yalestar.model;

import java.util.Date;

public class Title {

    private String title;
    private Date lastUpdated;


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public Date getLastUpdated() {
        return lastUpdated;
    }


    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
