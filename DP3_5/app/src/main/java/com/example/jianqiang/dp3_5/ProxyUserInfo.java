package com.example.jianqiang.dp3_5;

import android.util.Log;

/**
 * Created by jianqiang on 16/8/9.
 */
public class ProxyUserInfo extends UserInfo{
    private UserInfo user;

    public ProxyUserInfo() {
        super();

        user = new UserInfo();
        user.role = "vip";
    }

    @Override
    public boolean isVIP()
    {
        Log.d("baobao", "");
        return user.isVIP();

    }
}
