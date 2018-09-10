package com.youzufang.model.base;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class BaseModel {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;

    public int getId() {
        return id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }
}
