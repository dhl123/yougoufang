package com.youzufang.model;

import com.youzufang.model.base.BaseModel;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")

//FIXME: 从 BaseModel 继承, 它实现了Id,CreatedAt和DeletedAt这几个字段, 所有的Model都有这几个字段所以提取出来
public class Account extends BaseModel {
    private String username;
    private String password;
    private String phonenumber;
    private int gender;
    private String address;
    private String pubkey;
    private String privkey;

    @Column
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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
