package com.example.jianqiang.dp5_3_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Receiver r = new Receiver();
        Command cmd = new ConcreteCommand(r);

        Invoker invoker = new Invoker();
        invoker.setCommand(cmd);
        invoker.executeCommand();
    }
}
