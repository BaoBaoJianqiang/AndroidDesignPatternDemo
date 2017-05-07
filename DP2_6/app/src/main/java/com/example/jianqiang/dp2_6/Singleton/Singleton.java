package com.example.jianqiang.dp2_6.Singleton;

/**
 * Created by jianqiang on 16/8/3.
 */
public class Singleton {
    private static Singleton mySingleton = null;

    private Singleton() {}

    public static Singleton getInstance() {
        if(mySingleton == null)
            mySingleton = new Singleton();

        return mySingleton;
    }

    public void Do() {

    }
}
