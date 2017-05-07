package com.example.jianqiang.dp5_4_1.Mementor;

public class Memento implements IMemento {
    public State state;

    public Memento(State state) {
        this.state = (State)state.clone();
    }
}