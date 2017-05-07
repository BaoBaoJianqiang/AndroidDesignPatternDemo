package com.example.jianqiang.dp5_4_1;

import android.app.Activity;
import android.os.Bundle;

public class Memento {
    public State state;

    public Memento(State state) {
        this.state = (State)state.clone();
    }
}
