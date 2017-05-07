package com.example.jianqiang.dp2_4;

import android.app.Activity;
import android.content.Intent;

public abstract class BaseActivity extends Activity {

	public void navigateTo(final String activityName, 
			final Intent intent) {

		Class<?> clazz = null;
		try {
			clazz = Class.forName(activityName);
			if (clazz != null) {
				intent.setClass(this, clazz);
				this.startActivity(intent);
			}
		} catch (final ClassNotFoundException e) {
			return;
		}
	}
}

