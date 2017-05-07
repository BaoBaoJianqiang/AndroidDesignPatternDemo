package com.example.jianqiang.dp3_5;

/**
 * Created by jianqiang on 16/8/9.
 */
public class UserInfo {
    public String role;

    public boolean isVIP() {
        if(role == "vip") {
            return  true;
        }

        return false;
    }
}
