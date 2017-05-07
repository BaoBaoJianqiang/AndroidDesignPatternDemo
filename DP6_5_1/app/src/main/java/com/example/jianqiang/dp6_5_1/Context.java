package com.example.jianqiang.dp6_5_1;

/**
 * Created by jianqiang on 16/8/20.
 */
public class Context {
    public State state;

    public void request() {
        state.handle();
    }
}
