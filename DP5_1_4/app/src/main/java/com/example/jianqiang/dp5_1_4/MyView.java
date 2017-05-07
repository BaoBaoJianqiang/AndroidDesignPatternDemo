package com.example.jianqiang.dp5_1_4;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.logging.Logger;

public class MyView extends View {


    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        boolean result = super.dispatchTouchEvent(ev);
        Log.d("baobao", "result= " + result + " info=" + MotionEvent.actionToString(ev.getAction()));
        return result;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean result = super.onTouchEvent(event);
        Log.d("baobao", "result= " + result + " info=" + MotionEvent.actionToString(event.getAction()));
        return result;
    }
}
