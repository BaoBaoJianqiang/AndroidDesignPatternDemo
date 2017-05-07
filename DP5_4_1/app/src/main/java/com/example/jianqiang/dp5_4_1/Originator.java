package com.example.jianqiang.dp5_4_1;

public class Originator {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public Originator() {

    }

    public Memento createMemento() {
        return new Memento(this.state);
    }
}
