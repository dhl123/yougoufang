package com.youzufang.model;

import com.youzufang.model.base.BaseModel;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class House extends BaseModel {
   // @Column
    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private Account user;


    @Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Comment> comments;

    @Column
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Question> questions;

    public Account getUser() {
        return user;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Question> getQuestions() {
        return questions;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getDecoration() {
        return decoration;
    }

    public void setDecoration(int decoration) {
        this.decoration = decoration;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public int getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(int rentMoney) {
        this.rentMoney = rentMoney;
    }

    public int getBookMoney() {
        return bookMoney;
    }

    public void setBookMoney(int bookMoney) {
        this.bookMoney = bookMoney;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public ArrayList<String> getImages() {
        return Images;
    }

    public void setImages(ArrayList<String> images) {
        Images = images;
    }

    @Column
    private String location;

    @Column
    private String type;

    @Column
    private int area;

    @Column
    private int floor;

    @Column
    private int decoration;

    @Column
    private String introduction;

    @Column
    private int rentMoney;

    @Column
    private int bookMoney;

    @Column
    private String equipment;

    @Column
    private ArrayList<String> Images;
}
