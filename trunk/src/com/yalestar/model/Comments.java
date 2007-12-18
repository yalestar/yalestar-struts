package com.yalestar.model;

import java.util.Collection;

public class Comments {

    private Collection comments;

    public Comments() {

    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public Collection getComments() {
        return this.comments;
    }
}
