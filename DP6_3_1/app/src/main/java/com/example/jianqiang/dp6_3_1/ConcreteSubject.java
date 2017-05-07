package com.example.jianqiang.dp6_3_1;

import java.util.ArrayList;

import javax.security.auth.*;

public class ConcreteSubject implements Subject {
    private ArrayList<Observer> list = new ArrayList<Observer>();

    public void attach(Observer obs) {
        list.add(obs);
    }

    public void detach(Observer obs) {
        list.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : list) {
            observer.update();
        }
    }
}
