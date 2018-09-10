package com.youzufang.model;

import com.youzufang.model.base.ContentBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Comment extends ContentBaseModel {
    @Column
    private int houseId;

}
