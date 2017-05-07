package com.example.jianqiang.dp5_1_1;

/**
 * Created by jianqiang on 16/8/13.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    boolean handleRequest(String s) {
        if(s.startsWith("s")) {
            //do something
            System.out.println("Handled in ConcreteHandler2");

            return true;
        }

        return false;
    }
}
