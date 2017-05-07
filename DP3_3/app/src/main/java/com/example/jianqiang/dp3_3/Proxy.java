package com.example.jianqiang.dp3_3;

/**
 * Created by jianqiang on 16/8/6.
 */
public class Proxy extends Subject {
    private RealSubject realSubject;

    @Override
    public void Request() {
        realSubject.Request();
    }
}
