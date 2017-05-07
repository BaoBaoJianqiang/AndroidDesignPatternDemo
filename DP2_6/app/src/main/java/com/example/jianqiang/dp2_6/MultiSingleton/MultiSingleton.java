package com.example.jianqiang.dp2_6.MultiSingleton;

/**
 * Created by jianqiang on 16/8/3.
 */
public class MultiSingleton {
    private static MultiSingleton mySingleton = null;

    private Subject s1, s2;

    private MultiSingleton() {
        s1 = new ConcreteSubject1();
        s2 = new ConcreteSubject2();
    }

    public static MultiSingleton getInstance() {
        if (mySingleton == null)
            mySingleton = new MultiSingleton();

        return mySingleton;
    }

    public Subject Do(int n) {
        if (n == 1)
            return s1;
        else
            return s2;
    }
}