package com.example.jianqiang.dp6_4_1;

import android.util.Log;

/**
 * Created by jianqiang on 16/8/19.
 */
public class Colleague4 extends Colleague{

    public Colleague4(Mediator mediator) {
        super(mediator);
    }

    public void doSomething4() {
        Log.d("baobao", "Colleague4 do something");

        mediator.update(this, null);
    }

    public void work4() {
        Log.d("baobao", "Colleague1 work4");
    }
}
