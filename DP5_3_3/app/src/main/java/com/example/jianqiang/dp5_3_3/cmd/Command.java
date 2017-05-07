package com.example.jianqiang.dp5_3_3.cmd;

/**
 * Created by jianqiang on 16/8/15.
 */
public interface Command {
    public void execute(double second);
    public void undo();
}
