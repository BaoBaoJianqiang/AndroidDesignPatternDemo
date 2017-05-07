package com.example.jianqiang.dp5_3_3;

/**
 * Created by jianqiang on 16/8/15.
 */
public class Calculator {

    private static Calculator mySingleton = null;

    private Calculator() {

    }

    public static Calculator getInstance() {
        if(mySingleton == null) {
            mySingleton = new Calculator();
        }

        return mySingleton;
    }


    private double result;

    public void add(double second) {
        result += second;
    }

    public void subtract(double second) {
        result -= second;
    }

    public void multiply(double second) {
        result *= second;
    }

    public void devide(double second) {
        result /= second;
    }

    public double getResult() {
        return result;
    }
}
