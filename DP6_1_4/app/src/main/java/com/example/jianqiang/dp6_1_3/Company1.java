package com.example.jianqiang.dp6_1_3;

import java.util.ArrayList;
import java.util.List;

public class Company1 implements Company {
    private List<Person> list = new ArrayList<Person>();

    public Company1() {
        list.add(new Person("zhangsan", "male"));
        list.add(new Person("lisi", "female"));
        list.add(new Person("wangwu", "male"));
    }

    public List<Person> getPersons() {
        return list;
    }

    @Override
    public Iterator iterator() {
        return new Company1Iterator(list);
    }
}
