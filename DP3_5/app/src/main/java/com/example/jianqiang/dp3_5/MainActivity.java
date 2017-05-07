package com.example.jianqiang.dp3_5;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v4.graphics.BitmapCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.util.Observable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        user = new UserInfo();
//        user.role = "vip";

        ProxyUserInfo user = new ProxyUserInfo();

        Button btnReport = (Button) findViewById(R.id.btnReport);
        if (user.isVIP())
            btnReport.setVisibility(View.VISIBLE);
        else
            btnReport.setVisibility(View.GONE);
    }
}
