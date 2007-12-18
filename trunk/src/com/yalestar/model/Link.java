package com.yalestar.model;

import java.util.Date;

public class Link {

    /*
        LinkID	int
        LinkName	varchar
        LinkURL	varchar
        Viewable	tinyint
        Category	varchar
     */
    private String linkName;

    private String linkURL;

    private Date addDate;

    private String category;

    private String viewable;


    public Link() {
    }


    public Link(String linkText,
                String linkURL, 
                String category,
                String viewable) {
        this.linkName = linkText;
        this.linkURL = linkURL;
        this.category = category;
        this.viewable = viewable;
    }


    public String getViewable() {
        return viewable;
    }


    public void setViewable(String viewable) {
        this.viewable = viewable;
    }


    public String getLinkName() {
        return linkName;
    }


    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }


    public String getLinkURL() {
        return linkURL;
    }


    public void setLinkURL(String linkURL) {
        this.linkURL = linkURL;
    }


    public Date getAddDate() {
        return addDate;
    }


    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }
}