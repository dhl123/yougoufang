package com.youzufang.model;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class FavoriteSet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "setId")
    private int setId;

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    public int getSetId() {
        return setId;
    }

    public void setSetId(int setId) {
        this.setId = setId;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;

    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;



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
