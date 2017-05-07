package com.example.jianqiang.dp2_4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		Bundle bundle = getIntent().getExtras();
		String name = bundle.getString("name");
	}
}
