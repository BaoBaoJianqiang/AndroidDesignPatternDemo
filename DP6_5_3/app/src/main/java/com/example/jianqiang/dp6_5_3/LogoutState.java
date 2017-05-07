package com.example.jianqiang.dp6_5_3;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by jianqiang on 16/8/20.
 */
public class LogoutState implements UserState {

    @Override
    public void forward(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void comment(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
