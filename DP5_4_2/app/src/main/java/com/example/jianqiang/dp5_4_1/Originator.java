package com.example.jianqiang.dp5_4_1;

public class Originator implements Cloneable {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public Originator() {

    }

    public IMemento createMemento() {
        return new Memento(this.state);
    }
}
