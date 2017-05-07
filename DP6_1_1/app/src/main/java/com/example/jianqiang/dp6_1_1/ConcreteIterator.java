package com.example.jianqiang.dp6_1_1;

/**
 * Created by jianqiang on 16/8/18.
 */
public class ConcreteIterator implements MyIterator {
    private ConcreteAggregate agg;
    private int index = 0;
    private int size = 0;

    public ConcreteIterator(ConcreteAggregate agg) {
        this.agg = agg;
        size = agg.size();
        index = 0;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index < size) {
            index ++;
        }
    }

    @Override
    public boolean isDone() {
        return index >= size;
    }

    @Override
    public Object current() {
        return agg.getElement(index);
    }
}
