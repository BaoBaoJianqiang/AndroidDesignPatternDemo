package com.example.jianqiang.dp5_1_3;

/**
 * Created by jianqiang on 16/8/13.
 */

//Helm 头盔
public class Helm extends Defence {
    public boolean handleRequest(int type) {
        boolean result;

        if(type == AttackType.fire){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}