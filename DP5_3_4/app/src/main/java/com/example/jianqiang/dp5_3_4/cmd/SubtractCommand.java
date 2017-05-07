package com.example.jianqiang.dp5_3_4.cmd;

import com.example.jianqiang.dp5_3_4.Calculator;

/**
 * Created by jianqiang on 16/8/15.
 */
public class SubtractCommand implements Command {
    private double second;

    @Override
    public void execute(double second) {
        this.second = second;
        Calculator.getInstance().subtract(second);
    }

    @Override
    public double getSecond() {
        return second;
    }
}
