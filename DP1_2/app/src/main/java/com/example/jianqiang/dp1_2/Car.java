package com.example.jianqiang.dp1_2;

/**
 * Created by jianqiang on 16/8/2.
 */
public class Car extends Vehicle {
    @Override
    public void setup() {
        start1();
        start2();
        start3();
    }

    @Override
    public void drive() {
        run1();
        run2();
    }

    @Override
    public void stop() {
        end1();
        end2();
    }

    public void start1() {
        //启动汽车的引擎的逻辑的代码
    }

    public void start2() {
        //启动汽车的引擎的逻辑的代码
    }

    public void start3() {
        //启动汽车的引擎的逻辑的代码
    }

    public void run1() {
        //汽车行驶逻辑的代码1
    }

    public void run2() {
        //汽车行驶逻辑的代码2
    }

    public void end1() {
        //把汽车停下来的逻辑的代码1
    }

    public void end2() {
        //把汽车停下来的逻辑的代码2
    }
}
