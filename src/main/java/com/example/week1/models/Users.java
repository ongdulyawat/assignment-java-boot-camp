package com.example.week1.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int zipcode;
    private int telephone;
    private String name;
    private String email;
    private String address;
    private String area;
    private String province;

    @OneToMany (fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private List<Orders> ordersList = new ArrayList<>();



    public Users(int id, int zipcode, int telephone, String name, String email, String address,
                 String area, String province){
        this.id = id;
        this.zipcode = zipcode;
        this.telephone = telephone;
        this.name = name;
        this.email = email;
        this.address = address;
        this.area = area;
        this.province = province;

    }



    public Users() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
