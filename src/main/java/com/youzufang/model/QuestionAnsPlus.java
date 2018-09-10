package com.youzufang.model;

import com.youzufang.model.base.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class QuestionAnsPlus extends BaseModel {
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column
    private int userId;
}
