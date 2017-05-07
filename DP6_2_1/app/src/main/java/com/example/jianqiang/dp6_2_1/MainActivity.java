package com.example.jianqiang.dp6_2_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Strategy s1 = new Strategy1();

        Context context = new Context();
        context.strategy = s1;
        context.doSomething();
    }
}
