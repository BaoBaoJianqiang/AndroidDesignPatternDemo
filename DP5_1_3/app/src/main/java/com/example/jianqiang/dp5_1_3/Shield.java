package com.example.jianqiang.dp5_1_3;

/**
 * Created by jianqiang on 16/8/13.
 */

//Shield 盾牌
public class Shield extends Defence {
    public boolean handleRequest(int type) {
        boolean result;

        if(type == AttackType.physical){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}