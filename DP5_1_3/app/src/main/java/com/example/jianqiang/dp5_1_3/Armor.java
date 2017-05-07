package com.example.jianqiang.dp5_1_3;

/**
 * Created by jianqiang on 16/8/13.
 */

//Armor 盔甲
public class Armor extends Defence {
    public boolean handleRequest(int type) {
        boolean result;

        if(type == AttackType.cold){
            result = true;
        } else {
            result = false;
        }

        return result;
    }
}