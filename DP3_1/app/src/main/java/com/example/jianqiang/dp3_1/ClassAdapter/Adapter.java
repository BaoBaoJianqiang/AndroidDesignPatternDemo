package com.example.jianqiang.dp3_1.ClassAdapter;

/**
 * Created by jianqiang on 16/8/5.
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void Request() {
        this.SpecificRequest();
    }
}
