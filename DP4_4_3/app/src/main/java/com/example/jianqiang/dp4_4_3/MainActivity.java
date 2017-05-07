package com.example.jianqiang.dp4_4_3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int c;
        try {
//            InputStream in = new LowerCaseInputStream(
//                            new BufferedInputStream(
//                            new FileInputStream("test.txt")));

            FileInputStream s1 = new FileInputStream("test.txt");
            BufferedInputStream s2 = new BufferedInputStream(s1);
            LowerCaseInputStream in = new LowerCaseInputStream(s2);

            while((c = in.read())>=0)
            {
                System.out.print((char)c);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
