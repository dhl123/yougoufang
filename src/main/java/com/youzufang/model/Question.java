package com.youzufang.model;

import com.youzufang.model.base.ContentBaseModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question extends ContentBaseModel {

    //@Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name="questionId")
    private List<QuestionAns> answers;

    public List<QuestionAns> getAnswers() {
        return answers;
    }
}
