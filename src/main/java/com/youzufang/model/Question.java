package com.youzufang.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "questionId")
    private int questionId;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
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
    //@Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name="questionId")
    private List<QuestionAns> answers;

    public List<QuestionAns> getAnswers() {
        return answers;
    }
}
