package com.example.jianqiang.dp4_4_1;

/**
 * Created by jianqiang on 16/8/12.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component op) {
        this.op = op;
    }

    public void operate()
    {
        super.operate();

        doSomething1();
    }

    public void doSomething1() {
        System.out.println("ConcreteDecoratorA doSomething1");
    }
}
