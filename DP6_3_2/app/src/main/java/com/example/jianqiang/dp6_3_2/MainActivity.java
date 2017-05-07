package com.example.jianqiang.dp6_3_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Content content = new Content();

        User user1 = new User("baobao", "baobao@qq.com");
        content.addUser(user1);

        User user2 = new User("jianqiang", "jianqiang@hotmail.com");
        content.addUser(user1);

        content.notifyUsers();
    }
}
