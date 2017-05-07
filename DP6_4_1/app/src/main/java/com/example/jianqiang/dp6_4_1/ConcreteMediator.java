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
        colleague1 = new Colleague1(this);
        colleague2 = new Colleague2(this);
        colleague3 = new Colleague3(this);
        colleague4 = new Colleague4(this);
    }

    public void fireEventByColleague1() {
        colleague1.doSomething1();
    }

    @Override
    public void update(Colleague c, Object param) {
        if (c instanceof Colleague1) {
            colleague2.work2();
            colleague3.work3();
        } else if (c instanceof Colleague2) {
            colleague1.work1();
        } else if (c instanceof Colleague3) {
            colleague4.work4();
        } else if (c instanceof Colleague4) {
            colleague1.work1();
        }
    }
}
