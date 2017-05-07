package com.example.jianqiang.dp3_3.staticstyle;

import com.example.jianqiang.dp3_3.Class2;

/**
 * Created by jianqiang on 16/8/6.
 */
public class Class2Proxy {
    Class2 class2 = new Class2();

    public void doSomething() {
        System.out.println("日志2开始");
        class2.work();
        System.out.println("日志2结束");
    }
}
