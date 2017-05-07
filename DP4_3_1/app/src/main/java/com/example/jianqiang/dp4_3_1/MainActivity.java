package com.example.jianqiang.dp4_3_1;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChessSingleton.getInstance().play(ChessEnum.Black, 1, 2);
        ChessSingleton.getInstance().play(ChessEnum.White, 2, 2);
    }
}
