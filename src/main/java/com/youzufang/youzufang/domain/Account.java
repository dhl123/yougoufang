package com.youzufang.youzufang.domain;

import javax.persistence.*;
import java.sql.Timestamp;
@Entity
@Table(name = "user")
public class Account {
    private int id;
    private String username;
    private String password;
    private String phonenumber;
    private int gender;
    private String address;
    private String pubkey;
    private String privkey;
    private Timestamp createdat;
    private Timestamp updateat;

    public Account() {
    }
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "createdat")
    public Timestamp getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Timestamp createdat) {
        this.createdat = createdat;
    }
    @Column(name = "updateat")
    public Timestamp getUpdateat() {
        return updateat;
    }

    public void setUpdateat(Timestamp updateat) {
        this.updateat = updateat;
    }
}
