package com.youzufang.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class QuestionAnsPlus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "answerPlusId")
    private int answerPlusId;

    public int getAnswerPlusId() {
        return answerPlusId;
    }

    public void setAnswerPlusId(int answerPlusId) {
        this.answerPlusId = answerPlusId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column
    private int userId;
    @Column
    private int answerId;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }
}
