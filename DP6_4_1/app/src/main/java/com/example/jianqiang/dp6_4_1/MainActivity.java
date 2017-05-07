package com.example.jianqiang.dp6_4_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConcreteMediator mediator = new ConcreteMediator();
        mediator.onCreate();

        mediator.fireEventByColleague1();
    }
}
