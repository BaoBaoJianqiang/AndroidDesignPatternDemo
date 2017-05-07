package com.example.jianqiang.dp5_4_1;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<IMemento> list;

    public CareTaker() {
        list = new ArrayList<IMemento>();
    }

    public void add(IMemento m) {
        list.add(m);
        //save memento by IO
    }

    public void remove(IMemento m) {
        list.remove(m);
    }

    public IMemento restore() {
        if(list.size() == 0)
            return null;

        return list.remove(list.size() -1);
    }

    public IMemento getMemento(int index) {
        return list.get(index);
    }

}
