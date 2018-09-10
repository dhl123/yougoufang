package com.youzufang.model;

import com.youzufang.model.base.ContentBaseModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionAns extends ContentBaseModel {

   // @Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name="answerId")
    private List<QuestionAnsPlus> pluses;
    @Column
    private int questionId;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public List<QuestionAnsPlus> getPluses() {
        return pluses;
    }
}
