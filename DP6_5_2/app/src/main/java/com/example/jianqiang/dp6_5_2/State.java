package com.example.jianqiang.dp6_5_2;

/**
 * Created by jianqiang on 16/8/20.
 */
public abstract class State {
    protected AirConditioner airConditioner;

    public State(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public abstract void blow();
}
