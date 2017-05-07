package com.example.jianqiang.dp5_3_4.cmd;

import com.example.jianqiang.dp5_3_4.Calculator;

/**
 * Created by jianqiang on 16/8/15.
 */
public class DevideCommand implements Command {
    private double second;

    @Override
    public void execute(double second) {
        this.second = second;
        Calculator.getInstance().devide(second);
    }

    @Override
    public double getSecond() {
        return second;
    }
}
