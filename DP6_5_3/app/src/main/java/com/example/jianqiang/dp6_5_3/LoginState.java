package com.example.jianqiang.dp6_5_3;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by jianqiang on 16/8/20.
 */
public class LoginState implements UserState {

    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发", Toast.LENGTH_LONG).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "写评论", Toast.LENGTH_LONG).show();
    }
}
