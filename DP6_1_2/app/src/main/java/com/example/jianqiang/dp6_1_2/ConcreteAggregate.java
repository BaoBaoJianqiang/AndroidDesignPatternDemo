package com.example.jianqiang.dp6_1_2;

/**
 * Created by jianqiang on 16/8/18.
 */
public class ConcreteAggregate extends Aggregate {
    private Object[] objs = {"Tom", "John", "Baobao", "White"};

    @Override
    public MyIterator createIterator() {
        return new ConcreteIterator();
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


    private class ConcreteIterator implements MyIterator {
        private int index = 0;

        @Override
        public void first() {
            index = 0;
        }

        @Override
        public void next() {
            if(index < objs.length) {
                index ++;
            }
        }

        @Override
        public boolean isDone() {
            return index >= objs.length;
        }

        @Override
        public Object current() {
            return objs[index];
        }
    }
}
