package com.example.jianqiang.dp3_3.dynalmicstyle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by jianqiang on 16/8/6.
 */
public class InvocationHandlerForTest implements InvocationHandler {
    private Object target;

    public InvocationHandlerForTest(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("日志开始");
        Object obj = method.invoke(target, objects);
        System.out.println("日志结束");
        return obj;
    }
}
