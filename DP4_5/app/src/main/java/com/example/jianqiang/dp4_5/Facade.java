package com.example.jianqiang.dp4_5;

/**
 * Created by jianqiang on 16/8/12.
 */
public class Facade {
    private ClassA classA;
    private ClassB classB;

    public Facade() {
        this.classA = new ClassA();
        this.classB = new ClassB();
    }

    public void doSomthing() {
        classA.doSomething();
    }

    public void work() {
        classB.work();
    }

    public void sleep() {
        ClassC.sleep();
    }
}
