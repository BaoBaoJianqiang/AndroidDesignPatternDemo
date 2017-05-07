package com.example.jianqiang.dp2_9;

/**
 * Created by jianqiang on 16/8/4.
 */
public class Director {
    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void Concrete() {
        builder.BuildPart();
    }
}
