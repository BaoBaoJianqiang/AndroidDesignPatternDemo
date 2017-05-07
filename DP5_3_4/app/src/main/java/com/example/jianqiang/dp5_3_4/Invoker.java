package com.example.jianqiang.dp5_3_4;

import com.example.jianqiang.dp5_3_4.cmd.AddCommand;
import com.example.jianqiang.dp5_3_4.cmd.Command;
import com.example.jianqiang.dp5_3_4.cmd.DevideCommand;
import com.example.jianqiang.dp5_3_4.cmd.MultiplyCommand;
import com.example.jianqiang.dp5_3_4.cmd.SubtractCommand;

import java.util.ArrayList;

/**
 * Created by jianqiang on 16/8/15.
 */
public class Invoker {
    private ArrayList<Command> cmdList;

    public Invoker() {
        cmdList = new ArrayList<Command>();
    }

    public void add(int second) {
        Command cmd = new AddCommand();
        cmdList.add(cmd);
        cmd.execute(second);
    }

    public void subtract(int second) {
        Command cmd = new SubtractCommand();
        cmdList.add(cmd);
        cmd.execute(second);
    }

    public void multiply(int second) {
        Command cmd = new MultiplyCommand();
        cmdList.add(cmd);
        cmd.execute(second);
    }

    public void devide(int second) {
        Command cmd = new DevideCommand();
        cmdList.add(cmd);
        cmd.execute(second);
    }

    public void undo() {
        cmdList.remove(cmdList.size() - 1);

        for(int i = 0 ; i < cmdList.size() ; i++) {
            Command cmd = cmdList.get(i);
            cmd.execute(cmd.getSecond());
        }
    }
}
