package com.example.jianqiang.dp5_4_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.jianqiang.dp5_4_1.Mementor.CareTaker;
import com.example.jianqiang.dp5_4_1.Mementor.IMemento;
import com.example.jianqiang.dp5_4_1.Mementor.Memento;
import com.example.jianqiang.dp5_4_1.Mementor.Originator;
import com.example.jianqiang.dp5_4_1.Mementor.State;

public class MainActivity extends Activity {
    EditText edtName;
    EditText edtAge;

    CareTaker careTaker = new CareTaker();
    Originator originator = new Originator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edtName);
        edtAge = (EditText) findViewById(R.id.edtAge);

        Button btnSave = (Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });

        Button btnUndo = (Button)findViewById(R.id.btnUndo);
        btnUndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                undo();
            }
        });
    }

    void save() {
        State state1 = new State();
        state1.name = edtName.getText().toString();
        state1.age = Integer.valueOf(edtAge.getText().toString());

        originator.setState(state1);
        careTaker.add(originator.createMemento());
    }

    void undo() {
        IMemento record2 = careTaker.restore();
        State s2 = ((Memento)record2).state;
        edtName.setText(s2.name);
        edtAge.setText(String.valueOf(s2.age));
    }
}
