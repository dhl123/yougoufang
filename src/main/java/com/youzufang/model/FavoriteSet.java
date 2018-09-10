package com.youzufang.model;

import com.youzufang.model.base.BaseModel;

import javax.persistence.*;
import java.util.List;

@Entity
public class FavoriteSet extends BaseModel {
    //@Column
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="setId")
    private List<FavoriteSetItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column
    private String name;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column

    private int userId;
    @Column
    private String description;

    public List<FavoriteSetItem> getItems() {
        return items;
    }
}
