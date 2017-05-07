package com.example.jianqiang.dp4_1_2;

import java.util.ArrayList;

/**
 * Created by jianqiang on 16/8/11.
 */
public class Story implements Role {
    private ArrayList<Role> children = new ArrayList<Role>();

    private String name;

    public Story(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(this.name);

        for(Role component : children){
            component.display();
        }
    }

    public void add(Role component) {
        children.add(component);
    }

    public void remove(Role component) {
        children.remove(component);
    }
}
