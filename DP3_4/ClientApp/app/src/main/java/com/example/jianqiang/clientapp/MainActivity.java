package com.example.jianqiang.clientapp;

import android.app.Activity;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jianqiang.serverapp.MyAidl;

public class MainActivity extends Activity {

    private MyAidl client;

    private ServiceConnection conn = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            client = MyAidl.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            client = null;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent();
        intent.setAction("com.example.jianqiang.serverapp.aidl.action.AIDL_SERVICE");
        intent.setPackage("com.example.jianqiang.serverapp");

        bindService(intent, conn, Service.BIND_AUTO_CREATE);

        try {
            int a = client.sum(1, 2);
            System.out.println(String.valueOf(a));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
