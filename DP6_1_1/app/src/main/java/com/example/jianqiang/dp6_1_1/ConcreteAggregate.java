package com.example.jianqiang.dp6_1_1;

/**
 * Created by jianqiang on 16/8/18.
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objs = {"Tom", "John", "Baobao", "White"};

    @Override
    public MyIterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index) {
        if(index < objs.length) {
            return objs[index];
        } else {
            return null;
        }
    }

    public int size() {
        return objs.length;
    }
}
