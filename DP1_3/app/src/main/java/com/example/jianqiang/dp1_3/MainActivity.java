package com.example.jianqiang.dp1_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person = new Person();
        Student student = new Student();

        sleep(person);
        sleep(student);

        studyInSchool(student);
        studyInSchool(person);
    }

    void studyInSchool(Student student) {
        student.studyInSchool();
    }

    void sleep(Person person) {
        person.sleep();
    }
}
