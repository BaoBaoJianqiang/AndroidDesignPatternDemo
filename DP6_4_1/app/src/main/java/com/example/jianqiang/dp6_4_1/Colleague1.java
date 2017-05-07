package com.example.jianqiang.dp6_4_1;

import android.util.Log;

/**
 * Created by jianqiang on 16/8/19.
 */
public class Colleague1 extends Colleague{

    public Colleague1(Mediator mediator) {
        super(mediator);
    }

    public void doSomething1() {
        Log.d("baobao", "Colleague1 do something");

        String param = "baobao";
        mediator.update(this, param);
    }

    public void work1() {
        Log.d("baobao", "Colleague1 work1");
    }
}
