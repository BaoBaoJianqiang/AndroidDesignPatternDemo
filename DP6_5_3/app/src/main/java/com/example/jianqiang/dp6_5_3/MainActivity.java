package com.example.jianqiang.dp6_5_3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {
    final int LOGIN = 1;
    final int LOGOUT = 0;

    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void loginSuccess() {
        user.name = "baobao";
        user.score = 100;
        user.setUserState(new LoginState());
    }

    void logout() {
        user.name = null;
        user.score = 0;
        user.setUserState(new LogoutState());
    }

    void forward() {
        user.forward(this);
    }

    void comment() {
        user.comment(this);
    }

}
