package com.itheima.domain;

/**
*@ClassName User
*@Author yc
*@Date:  2018/11/18 21:36
*@Version V1.0
**/
public class User {
    private String name;
    private String address;


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
