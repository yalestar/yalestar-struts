package com.yalestar.model;

import java.util.Date;

public class Comment {

    private String name;

    private String message;

    private String postID;

    private String email;

    private String ipAddress;

    private Date commentDate;


    public Comment(String author,
                   String message,
                   String entryID,
                   String email) {
        this.name = author;
        this.message = message;
        this.postID = entryID;
        this.email = email;


    }


    /**
     * Default constructor; useful for BeanUtils.copyProperties
     */
    public Comment() {

    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }


    public String getPostID() {
        return postID;
    }


    public void setPostID(String postID) {
        this.postID = postID;
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


    public Date getCommentDate() {
        return commentDate;
    }


    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}
