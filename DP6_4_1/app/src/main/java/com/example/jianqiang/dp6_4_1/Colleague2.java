package com.example.jianqiang.dp6_4_1;

import android.util.Log;

/**
 * Created by jianqiang on 16/8/19.
 */
public class Colleague2 extends Colleague{

    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    public void doSomething1() {
        Log.d("baobao", "Colleague2 do something");

        String param = "jianqiang";
        mediator.update(this, param);
    }

    public void work2() {
        Log.d("baobao", "Colleague1 work2");
    }
}
