package com.example.jianqiang.dp4_4_1;

/**
 * Created by jianqiang on 16/8/12.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component op) {
        this.op = op;
    }

    public void operate()
    {
        super.operate();

        doSomething2();
    }

    public void doSomething2() {
        System.out.println("ConcreteDecoratorB doSomething2");
    }
}
