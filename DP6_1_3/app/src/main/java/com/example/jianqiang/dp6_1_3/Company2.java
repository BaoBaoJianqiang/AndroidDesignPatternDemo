package com.example.jianqiang.dp6_1_3;

import java.util.ArrayList;
import java.util.List;

public class Company2 {
    private Person[] array = new Person[3];

    public Company2() {
        array[0] = new Person("zhangsan", "male");
        array[1] = new Person("lisi", "female");
        array[2] = new Person("wangwu", "male");
    }

    public Person[] getPersons() {
        return array;
    }
}
