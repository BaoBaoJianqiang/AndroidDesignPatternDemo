package com.example.jianqiang.dp3_3;

/**
 * Created by jianqiang on 16/8/6.
 */
public class Class1Proxy implements Class1Interface {
    Class1 clzz = new Class1();

    @Override
    public void doSomething() {
        System.out.println("Begin log");
        clzz.doSomething();
        System.out.println("End log");
    }
}
