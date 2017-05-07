package com.example.jianqiang.dp3_1.ObjectAdapter;

/**
 * Created by jianqiang on 16/8/5.
 */
public class Adapter2 extends Target2 {
    Adaptee2 adaptee = new Adaptee2();

    @Override
    public void Request() {
        adaptee.SpecificRequest();
    }
}
