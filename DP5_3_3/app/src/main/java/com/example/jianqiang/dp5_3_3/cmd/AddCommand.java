package com.example.jianqiang.dp5_3_3.cmd;

import com.example.jianqiang.dp5_3_3.Calculator;

/**
 * Created by jianqiang on 16/8/15.
 */
public class AddCommand implements Command {
    private double second;

    @Override
    public void execute(double second) {
        this.second = second;
        Calculator.getInstance().add(second);
    }

    @Override
    public void undo() {
        Calculator.getInstance().subtract(second);
    }
}
