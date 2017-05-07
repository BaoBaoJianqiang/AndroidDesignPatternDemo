package com.example.jianqiang.dp4_1;

/**
 * Created by jianqiang on 16/8/11.
 */
public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(this.name);
    }
}
