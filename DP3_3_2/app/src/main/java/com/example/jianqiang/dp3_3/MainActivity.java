package com.example.jianqiang.dp3_3;

import android.app.Activity;
import android.os.Bundle;

import com.example.jianqiang.dp3_3.dynalmicstyle.InvocationHandlerForTest;
import com.example.jianqiang.dp3_3.staticstyle.Class2Proxy;

import java.lang.reflect.Proxy;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testClass1();
        testClass2();

        testClass3();
        testClass4();
    }

    public void testClass1() {
        com.example.jianqiang.dp3_3.staticstyle.Class1Proxy proxy = new com.example.jianqiang.dp3_3.staticstyle.Class1Proxy();
        proxy.doSomething();
    }

    public void testClass2() {
        com.example.jianqiang.dp3_3.staticstyle.Class2Proxy proxy = new Class2Proxy();
        proxy.doSomething();
    }


    public void testClass3() {
        Class1Interface class1 = new Class1();

        Class1Interface class1Proxy = (Class1Interface) Proxy.newProxyInstance(
                class1.getClass().getClassLoader(),
                class1.getClass().getInterfaces(),
                new InvocationHandlerForTest(class1));
        class1Proxy.doSomething();
    }

    public void testClass4() {
        Class2Interface class2 = new Class2();

        Class2Interface class2Proxy = (Class2Interface) Proxy.newProxyInstance(
                class2.getClass().getClassLoader(),
                class2.getClass().getInterfaces(),
                new InvocationHandlerForTest(class2));
        class2Proxy.work();
    }
}
