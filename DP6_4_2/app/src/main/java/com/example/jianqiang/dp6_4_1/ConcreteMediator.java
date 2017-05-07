package com.example.jianqiang.dp6_4_1;

/**
 * Created by jianqiang on 16/8/19.
 */
public class ConcreteMediator extends Mediator {

    private Colleague1 colleague1;
    private Colleague2 colleague2;
    private Colleague3 colleague3;
    private Colleague4 colleague4;

    @Override
    public void onCreate() {
        colleague1 = new Colleague1();
        colleague1.setOnColleague1DoSomethingListener(new ColleagueDoSomethingListener() {
            @Override
            public void doSomething() {
                colleague2.work2();
                colleague3.work3();
            }
        });

        colleague2 = new Colleague2();
        colleague2.setOnColleague1DoSomethingListener(new ColleagueDoSomethingListener() {
            @Override
            public void doSomething() {
                colleague4.work4();
            }
        });

        colleague3 = new Colleague3();
        colleague3.setOnColleague1DoSomethingListener(new ColleagueDoSomethingListener() {
            @Override
            public void doSomething() {
                colleague1.work1();
                colleague4.work4();
            }
        });

        colleague4 = new Colleague4();
        colleague4.setOnColleague1DoSomethingListener(new ColleagueDoSomethingListener() {
            @Override
            public void doSomething() {
                colleague1.work1();
            }
        });
    }

    public void fireEventByColleague1() {
        colleague1.getListener().doSomething();
    }
}
