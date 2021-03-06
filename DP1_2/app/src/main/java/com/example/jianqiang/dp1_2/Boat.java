package com.example.jianqiang.dp1_2;

/**
 * Created by jianqiang on 16/8/2.
 */
public class Boat extends Vehicle {
    @Override
    public void setup() {
        setup1();
        setup2();
        setup3();
    }

    @Override
    public void drive() {
        drive1();
        drive2();
        drive3();
    }

    @Override
    public void stop() {
        stop1();
        stop2();
        stop3();
    }

    public void setup1() {
        //启动轮船的step 1
    }

    public void setup2() {
        //启动轮船的step 2
    }

    public void setup3() {
        //启动轮船的step 3
    }

    public void drive1() {
        //邮轮行驶逻辑的代码1
    }

    public void drive2() {
        //邮轮行驶逻辑的代码2
    }

    public void drive3() {
        //邮轮行驶逻辑的代码3
    }

    public void stop1() {
        //把船停下来的逻辑的代码1
    }

    public void stop2() {
        //把船停下来的逻辑的代码2
    }

    public void stop3() {
        //把船停下来的逻辑的代码3
    }
}
