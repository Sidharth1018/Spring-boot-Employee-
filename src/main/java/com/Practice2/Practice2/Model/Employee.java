package com.Practice2.Practice2.Model;


public class Employee {
    int id;

    String name;
    String dis;

    String state;

    public Employee(int id, String name, String dis, String state) {
        this.id = id;
        this.name = name;
        this.dis = dis;
        this.state = state;
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

    public String getDis() {
        return dis;
    }

    public void setDis(String dis) {
        this.dis = dis;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



}
