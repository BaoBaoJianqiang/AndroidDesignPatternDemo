package com.example.jianqiang.dp5_1_1;

/**
 * Created by jianqiang on 16/8/13.
 */
public class ConcreteHandler1 extends Handler {
    @Override
    boolean handleRequest(String s) {
        if(s.endsWith("l")) {
            //do something
            System.out.println("Handled in ConcreteHandler1");

            return true;
        }

        return false;
    }
}
