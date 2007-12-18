package com.yalestar.model;

import java.util.Date;

public class Bandname {

    private String bandnames;

    private String author;

    private Date addDate;

    private int id;


    public Bandname() {
    }


    public Bandname(String bandnames, String author, Date addDate, int id) {
        this.bandnames = bandnames;
        this.author = author;
        this.addDate = addDate;
        this.id = id;
    }


    public Bandname(String bandname, String author, Date addDate) {
        this.bandnames = bandname;
        this.author = author;
        this.addDate = addDate;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getBandnames() {
        return bandnames;
    }


    public void setBandnames(String bandnames) {
        this.bandnames = bandnames;
    }


    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }


    public Date getAddDate() {
        return addDate;
    }


    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }
}
