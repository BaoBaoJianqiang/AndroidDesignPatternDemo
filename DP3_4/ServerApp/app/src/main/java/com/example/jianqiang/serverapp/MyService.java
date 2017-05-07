package com.example.jianqiang.serverapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.annotation.Nullable;

/**
 * Created by jianqiang on 16/8/7.
 */
public class MyService extends Service {
    @Override
    public void onCreate() {
        System.out.println("baobao");

        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        System.out.println("baobao2");

        return new MyAidl.Stub() {

            @Override
            public int sum(int int1, int int2) throws RemoteException {
                System.out.println("baobao");
                return int1 + int2;
            }
        };
    }
}
