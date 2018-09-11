package com.youzufang.model;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "commentId")
    private int commentId;

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    //FIXME: 好像做双向外键很麻烦, 这里直接用userId替代了, 业务层处理一下
    private int userId;

    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }


}
