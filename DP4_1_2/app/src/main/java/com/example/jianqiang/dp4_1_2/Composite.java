package com.example.jianqiang.dp4_1_2;

import java.util.ArrayList;

/**
 * Created by jianqiang on 16/8/11.
 */
public class Composite implements Component {
    private ArrayList<Component> children = new ArrayList<Component>();

    private String name;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(this.name);

        for(Component component : children){
            component.display();
        }
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }
}
