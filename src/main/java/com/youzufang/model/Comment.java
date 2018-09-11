package com.youzufang.model;

import com.youzufang.model.base.ContentBaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Comment extends ContentBaseModel {
    @Column
    private int houseId;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }
}
