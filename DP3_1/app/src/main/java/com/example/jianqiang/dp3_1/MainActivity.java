package com.example.jianqiang.dp3_1;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianqiang.dp3_1.ClassAdapter.Adapter;
import com.example.jianqiang.dp3_1.ClassAdapter.Target;
import com.example.jianqiang.dp3_1.ObjectAdapter.Adaptee2;
import com.example.jianqiang.dp3_1.ObjectAdapter.Adapter2;
import com.example.jianqiang.dp3_1.ObjectAdapter.Target2;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Target target = new Adapter();
        target.Request();

        Target2 target2 = new Adapter2();
        target2.Request();
    }
}
