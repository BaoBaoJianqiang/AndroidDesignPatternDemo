package com.example.jianqiang.dp5_3_3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Invoker invoker = new Invoker();
        invoker.add(100);
        invoker.devide(10);
        invoker.add(20);

        invoker.undo();

        double result = Calculator.getInstance().getResult();
    }
}
