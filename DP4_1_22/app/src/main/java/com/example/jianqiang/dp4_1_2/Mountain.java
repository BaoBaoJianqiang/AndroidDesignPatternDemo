package com.example.jianqiang.dp4_1_2;

/**
 * Created by jianqiang on 16/8/11.
 */
public class Mountain implements Role {

    private String name;

    public Mountain(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }
}
