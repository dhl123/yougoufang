package com.youzufang.model;

import com.youzufang.model.base.BaseModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class House extends BaseModel {
    @Column
    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private Account user;


    @Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Comment> comments;

    @Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Question> questions;

    public Account getUser() {
        return user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    /*
    ... //TODO: 补充 很多字段还没写
     */
}
