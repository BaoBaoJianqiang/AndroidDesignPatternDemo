package com.example.jianqiang.dp6_1_3;

import java.util.List;

public class Company2Iterator implements Iterator {
    private Person[] array;
    private int position;

    public Company2Iterator(Person[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return !(position > array.length - 1 || array[position] == null);
    }

    @Override
    public Object next() {
        Person person = array[position];
        position++;
        return person;
    }
}
