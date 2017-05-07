package com.example.jianqiang.dp3_3;

/**
 * Created by jianqiang on 16/8/6.
 */
public class Class2Proxy implements Class2Interface {
    Class2 clzz = new Class2();

    @Override
    public void work() {
        System.out.println("Begin log");
        clzz.work();
        System.out.println("End log");
    }


}
