package com.example.jianqiang.dp4_2_1;

/**
 * Created by jianqiang on 16/8/11.
 */
public class Plural {
    private double x;
    private double y;

    public Plural(double x, double y) {
        this.x = x;
        this.x = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Plural Add(Plural p)
    {
        return new Plural(this.x + p.x, this.y + p.y);
    }
}
