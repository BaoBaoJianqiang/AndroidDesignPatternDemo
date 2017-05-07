package com.example.jianqiang.dp5_2_1;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        invokeURL();
    }

    void invokeURL() {
        String url = "";

        RequestAsyncTask task = new RequestAsyncTask() {

            @Override
            public void onSuccess(String result) {

            }

            @Override
            public void onFail(String errorMessage) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("出错啦").setMessage(errorMessage)
                        .setPositiveButton("确定", null).show();
            }
        };
        task.execute(url);
    }
}
