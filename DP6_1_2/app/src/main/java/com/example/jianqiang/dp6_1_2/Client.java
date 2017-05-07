package com.example.jianqiang.dp6_1_2;

import android.util.Log;

/**
 * Created by jianqiang on 16/8/18.
 */
public class Client {
    MyIterator it;
    Aggregate agg = new ConcreteAggregate();

    public void operate() {
        it = agg.createIterator();
        while(!it.isDone()) {
            Log.d("baobao", it.current().toString());
            it.next();;
        }
    }
}
