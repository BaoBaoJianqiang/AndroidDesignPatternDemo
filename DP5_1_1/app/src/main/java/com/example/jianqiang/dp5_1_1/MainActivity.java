package com.example.jianqiang.dp5_1_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler;
        ConcreteHandler1 ch1 = new ConcreteHandler1();
        ConcreteHandler2 ch2 = new ConcreteHandler2();

        //组链
        handler = ch1;
        handler.setNext(ch2);

        //使用
        handler.doHandler("apples");
    }
}
