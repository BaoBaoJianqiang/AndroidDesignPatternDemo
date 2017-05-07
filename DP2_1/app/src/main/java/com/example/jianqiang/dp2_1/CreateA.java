package com.example.jianqiang.dp2_1;

/**
 * Created by jianqiang on 16/8/3.
 */
public class CreateA {
    public static A creatAFactory(int type) {
        A a = null;

        switch (type) {
            case 1:
                a = new A1();
                break;
            case 2:
                a = new A2();
                break;
            default:
                break;
        }

        return a;
    }
}
