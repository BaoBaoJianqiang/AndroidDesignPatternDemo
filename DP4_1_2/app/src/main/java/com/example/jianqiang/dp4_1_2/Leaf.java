package com.example.jianqiang.dp4_1_2;

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

    @Override
    public void add(Component component) {
        //do nothing
    }

    @Override
    public void remove(Component component) {
        //do nothing
    }
}
