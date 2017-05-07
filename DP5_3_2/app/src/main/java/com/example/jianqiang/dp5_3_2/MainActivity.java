package com.example.jianqiang.dp5_3_2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClassA a = new ClassA();
                a.doSomething();
            }
        });

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ClassA a = new ClassA();
                a.doSomething();
            }
        });
    }
}
