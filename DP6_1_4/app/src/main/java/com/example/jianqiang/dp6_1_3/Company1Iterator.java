package com.example.jianqiang.dp6_1_3;

import java.util.ArrayList;
import java.util.List;

public class Company1Iterator implements Iterator {
    private List<Person> list;
    private int position;

    public Company1Iterator(List<Person> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return !(position > list.size() - 1 || list.get(position) == null);
    }

    @Override
    public Object next() {
        Person person = list.get(position);
        position++;
        return person;
    }
}
