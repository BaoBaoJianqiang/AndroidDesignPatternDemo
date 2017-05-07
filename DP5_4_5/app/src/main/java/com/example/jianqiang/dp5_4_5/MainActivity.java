package com.example.jianqiang.dp5_4_5;

import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText edtName;
    EditText edtAge;

    Button btn;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edtName);
        edtAge = (EditText) findViewById(R.id.edtAge);

        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;

                new AlertDialog.Builder(MainActivity.this)
                        .setMessage(String.valueOf(i))
                        .show();
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("i", i);
    }

    @Override
    protected void onRestoreInstanceState(Bundle bundle) {
        i = (int)bundle.get("i");
    }
}
