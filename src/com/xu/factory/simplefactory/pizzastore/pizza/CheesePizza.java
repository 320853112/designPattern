package com.xu.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 13:15
 * @Description:
 **/
public class CheesePizza extends Pizza{

    @Override
    public void prepare() {
        setName("CheesePizza");
        System.out.println("CheesePizza prepare");
    }
}
