package com.example.jianqiang.dp4_1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Story story = new Story("1-story");
        story.add(new Mountain("1-Mountain"));
        story.add(new Temple("1-Temple"));
        story.add(new Monk("1-Monk"));

        Story story2 = new Story("2-story");
        story2.add(new Mountain("2-Mountain"));
        story2.add(new Temple("-Temple"));
        story2.add(new Monk("2-Monk"));

        story.add(story2);

        story.display();
    }
}
