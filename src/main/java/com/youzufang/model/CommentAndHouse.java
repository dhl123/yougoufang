package com.youzufang.model;

import javax.persistence.Entity;
import java.io.Serializable;

public class CommentAndHouse implements Serializable {

    private static final long serialVersionUID = -6347911007178390219L;

    private Comment comment;
    private House house;
    public CommentAndHouse() {
    }
    public CommentAndHouse(Comment comment) {
        House house = new House();
        this.comment = comment;
        this.house = house;
    }

    public CommentAndHouse(House house) {
        Comment comment = new Comment();
        this.comment = comment;
        this.house = house;
    }

    public CommentAndHouse(Comment comment, House house) {
        this.comment = comment;
        this.house = house;
    }

    // getter, setter

}