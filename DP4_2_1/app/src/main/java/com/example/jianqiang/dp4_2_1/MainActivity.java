package com.example.jianqiang.dp4_2_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Plural p1 = new Plural(1.2, 3.4);
        Plural p2 = new Plural(11.2, 33.4);

        Plural p3 = p1.Add(p2);
    }
}
