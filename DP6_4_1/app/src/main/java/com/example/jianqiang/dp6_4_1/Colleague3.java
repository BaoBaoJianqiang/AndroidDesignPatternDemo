package com.example.jianqiang.dp6_4_1;

import android.util.Log;

/**
 * Created by jianqiang on 16/8/19.
 */
public class Colleague3 extends Colleague{

    public Colleague3(Mediator mediator) {
        super(mediator);
    }

    public void doSomething3() {
        Log.d("baobao", "Colleague3 do something");

        mediator.update(this, null);
    }

    public void work3() {
        Log.d("baobao", "Colleague1 work3");
    }
}
