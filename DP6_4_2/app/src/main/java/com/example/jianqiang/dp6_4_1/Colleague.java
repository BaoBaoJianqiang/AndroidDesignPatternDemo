package com.example.jianqiang.dp6_4_1;

/**
 * Created by jianqiang on 16/8/19.
 */
public class Colleague {
    private ColleagueDoSomethingListener listener;

    public ColleagueDoSomethingListener getListener() {
        return listener;
    }

    public void setOnColleague1DoSomethingListener(ColleagueDoSomethingListener listener) {
        this.listener = listener;
    }
}
