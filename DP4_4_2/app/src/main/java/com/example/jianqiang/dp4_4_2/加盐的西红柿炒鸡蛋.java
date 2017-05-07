package com.example.jianqiang.dp4_4_2;

/**
 * Created by jianqiang on 16/8/12.
 */
public class 加盐的西红柿炒鸡蛋 implements 佳肴 {
    佳肴 cai;

    public 加盐的西红柿炒鸡蛋(佳肴 cai) {
        this.cai = cai;
    }

    public void 炒菜() {
        cai.炒菜();;

        this.加盐();
    }

    public void 加盐() {
        //加 a little 盐
    }
}
