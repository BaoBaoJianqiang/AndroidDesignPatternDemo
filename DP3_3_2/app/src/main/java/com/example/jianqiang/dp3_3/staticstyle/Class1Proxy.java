package com.example.jianqiang.dp3_3.staticstyle;

import com.example.jianqiang.dp3_3.Class1;

/**
 * Created by jianqiang on 16/8/6.
 */
public class Class1Proxy {
    Class1 class1 = new Class1();

    public void doSomething() {
        System.out.println("日志开始");
        class1.doSomething();
        System.out.println("日志结束");
    }
}
