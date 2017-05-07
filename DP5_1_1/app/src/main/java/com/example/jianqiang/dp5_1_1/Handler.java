package com.example.jianqiang.dp5_1_1;

/**
 * Created by jianqiang on 16/8/13.
 */
public abstract class Handler {
    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    abstract boolean handleRequest(String s);

    public void doHandler(String s) {
        if (! handleRequest(s)) {
            if (next != null) {
                next.doHandler(s);
            } else {
                System.out.println("已经到达尽头，无法对其进行处理！");
            }
        }
    }
}
