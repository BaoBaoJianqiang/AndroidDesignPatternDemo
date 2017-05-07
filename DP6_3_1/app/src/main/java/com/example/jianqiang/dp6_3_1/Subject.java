package com.example.jianqiang.dp6_3_1;

import java.util.ArrayList;
import java.util.Observable;

public interface Subject {
    public void attach(Observer obs);
    public void detach(Observer obs);

    public void notifyObservers();
}
