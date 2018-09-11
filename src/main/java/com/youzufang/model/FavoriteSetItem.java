package com.youzufang.model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class FavoriteSetItem{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemId")
    private int itemId;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
