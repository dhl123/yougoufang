package com.youzufang.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "user")

public class Account {
    private String username;
    private String password;
    private String phonenumber;
    private int gender;
    private String address;
    private String pubkey;
    private String privkey;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private int userId;

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp createdAt;

    @Column(insertable = false,updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    private Timestamp updatedAt;

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="userId")
    private FavoriteSet favoriteSet;


    public Account() {
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Column(name = "phonenumber")
    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    @Column(name = "gender")
    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @Column(name = "pubkey")
    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }
    @Column(name = "privkey")
    public String getPrivkey() {
        return privkey;
    }

    public void setPrivkey(String privkey) {
        this.privkey = privkey;
    }

    public FavoriteSet getFavoriteSets() {
        return favoriteSet;
    }
}
