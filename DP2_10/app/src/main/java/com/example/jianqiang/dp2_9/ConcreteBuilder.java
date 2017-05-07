package com.example.jianqiang.dp2_9;

/**
 * Created by jianqiang on 16/8/4.
 */
public class ConcreteBuilder extends Builder {

    Product product;

    public ConcreteBuilder(){
        product = new Product();
    }

    @Override
    public Builder BuildPart1(String name) {
        product.name = name;

        return this;
    }

    @Override
    public Builder BuildPart2(String productDate) {
        product.productDate = productDate;

        return this;
    }

    @Override
    public Product getResult() {
        return product;
    }
}
