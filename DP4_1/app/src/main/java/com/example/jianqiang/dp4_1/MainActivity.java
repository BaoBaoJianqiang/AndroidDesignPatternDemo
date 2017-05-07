package com.example.jianqiang.dp4_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Composite root = new Composite("1");
        root.add(new Leaf("2"));

        Composite comp1 = new Composite("3");
        comp1.add(new Leaf("4"));
        comp1.add(new Leaf("5"));

        root.add(comp1);

        root.display();
    }
}