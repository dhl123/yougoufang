package com.youzufang.model;

import com.youzufang.model.base.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class FavoriteSetItem extends BaseModel {
    @Column
    private int houseId;
}
