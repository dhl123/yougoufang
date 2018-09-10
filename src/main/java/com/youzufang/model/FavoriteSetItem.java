package com.youzufang.model;

import com.youzufang.model.base.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class FavoriteSetItem extends BaseModel {
    @Column
    private int houseId;
    @Column
    private int setId;

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    public int getSetId() {
        return setId;
    }

    public void setSetId(int setId) {
        this.setId = setId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    @Column
    private int userId;
}
