package com.example.jianqiang.dp5_4_1;

public class State implements Cloneable {

    public State() {

    }

    public String name;
    public int age;

    public Object clone() {
        State state = null;

        try {
            state = (State)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return state;
    }
}
