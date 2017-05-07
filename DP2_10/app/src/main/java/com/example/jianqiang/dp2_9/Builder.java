package com.example.jianqiang.dp2_9;

/**
 * Created by jianqiang on 16/8/4.
 */
public abstract class Builder {
    public abstract Builder BuildPart1(String name);
    public abstract Builder BuildPart2(String productDate);

    public abstract Product getResult();
}
