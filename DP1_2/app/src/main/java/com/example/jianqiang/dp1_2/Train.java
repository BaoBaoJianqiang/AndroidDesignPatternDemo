package com.example.jianqiang.dp1_2;

/**
 * Created by jianqiang on 16/8/2.
 */
public class Train extends Vehicle {
    @Override
    public void setup() {
        startEngine();
    }

    @Override
    public void drive() {
        driveTrain();
    }

    @Override
    public void stop() {
        stopRunning1();
        stopRunning2();
    }

    public void startEngine() {
        //启动火车的引擎的逻辑的代码
    }

    public void driveTrain() {
        //火车行驶逻辑的代码
    }

    public void stopRunning1() {
        //把火车停下来的逻辑的代码
    }
    public void stopRunning2() {
        //把火车停下来的逻辑的代码
    }
}
