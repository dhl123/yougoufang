package com.youzufang.model;

import com.youzufang.model.base.ContentBaseModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionAns extends ContentBaseModel {

    @Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<QuestionAnsPlus> pluses;

    public List<QuestionAnsPlus> getPluses() {
        return pluses;
    }
}
