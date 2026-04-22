package com.flowerbase.practice.model;

public class UserModel {
    private String name;
    private int age;

    public UserModel(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getUserName(){
        return name;
    }
    public int getUserAge(){
        return age;
    }

}
