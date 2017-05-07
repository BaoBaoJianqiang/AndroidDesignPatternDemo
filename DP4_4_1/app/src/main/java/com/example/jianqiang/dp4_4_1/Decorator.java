package com.example.jianqiang.dp4_4_1;

/**
 * Created by jianqiang on 16/8/12.
 */
public class Decorator implements Component {
    protected Component op;

    public void operate() {
        op.operate();
    }
}
