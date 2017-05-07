package com.example.jianqiang.dp6_5_3;

import android.content.Context;
import android.content.Intent;

/**
 * Created by jianqiang on 16/8/20.
 */
public class User {
    //默认为未登录
    public UserState state = new LogoutState();

    public String name;
    public int score;

    public void setUserState(UserState state) {
        this.state = state;
    }

    public void forward(Context context) {
        state.forward(context);
    }

    public void comment(Context context) {
        state.comment(context);
    }
}
