package com.example.jianqiang.dp6_1_3;

public class Person {
    public String name;
    public String sex;

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + "," + sex;
    }
}
