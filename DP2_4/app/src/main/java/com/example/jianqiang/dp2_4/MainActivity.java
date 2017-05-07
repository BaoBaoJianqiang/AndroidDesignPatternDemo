package com.example.jianqiang.dp2_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    Button btnNav1, btnNav2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNav1 = (Button) findViewById(R.id.btnNav1);
        btnNav1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                intent.putExtra("name", "Jianqiang");
                startActivity(intent);
            }
        });

        btnNav2 = (Button) findViewById(R.id.btnNav2);
        btnNav2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name", "Jianqiang");
                navigateTo(ActivityNameConstants.SecondActivity, intent);
            }
        });
    }
}
