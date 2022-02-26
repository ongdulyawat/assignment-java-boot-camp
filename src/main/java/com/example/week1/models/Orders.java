package com.example.week1.models;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int userId;
    private int price;
    private String status;
    private String address;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "userId",insertable = false,updatable = false)
    private Users users;


    public Orders(int id,int userId,int price,String status,String address){
        this.id = id;
        this.userId = userId;
        this.price = price;
        this.status = status;
        this.address = address;
//        this.users = new Users();
    }

    public Orders() {

    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}


