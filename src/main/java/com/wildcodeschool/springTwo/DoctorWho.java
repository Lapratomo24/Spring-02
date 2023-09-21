package com.wildcodeschool.springTwo;

public class DoctorWho {
    private int num;
    private String name;

    public DoctorWho() {
    }

    public DoctorWho(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DoctorWho{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}