package com.example.jianqiang.dp5_4_1;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> list;

    public CareTaker() {
        list = new ArrayList<Memento>();
    }

    public void add(Memento m) {
        list.add(m);
    }

    public void remove(Memento m) {
        list.remove(m);
    }

    public Memento restore() {
        if(list.size() == 0)
            return null;

        return list.remove(list.size() -1);
    }

    public Memento getMemento(int index) {
        return list.get(index);
    }

}
