package com.example.jianqiang.dp5_1_3;

/**
 * Created by jianqiang on 16/8/13.
 */
public class Person {
    public Defence root;

    public int HP;

    public void achieveHarm(int type) {
        if(!root.defence(type)) {
            HP -= 10;
        }
    }
}
