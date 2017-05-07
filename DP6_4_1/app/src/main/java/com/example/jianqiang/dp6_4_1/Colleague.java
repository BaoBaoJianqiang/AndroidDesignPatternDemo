package com.example.jianqiang.dp6_4_1;

/**
 * Created by jianqiang on 16/8/19.
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
