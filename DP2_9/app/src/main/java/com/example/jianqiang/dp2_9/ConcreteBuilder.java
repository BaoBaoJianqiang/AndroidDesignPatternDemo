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
    public void BuildPart() {
        product.name = "jianqiang";
        product.productDate = "1982-1-14";
    }

    public Product getResult() {
        return product;
    }
}
