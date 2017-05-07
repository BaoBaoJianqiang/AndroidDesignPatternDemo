package com.example.jianqiang.dp6_2_2;

import java.util.Date;

/**
 * Created by jianqiang on 16/8/18.
 */
public class Context {
    private SortStrategy strategy;

    public Context(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort() {
        strategy.sort();
    }
}
