package com.xu.factory.absfactory.pizzastore.pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 16:58
 * @Description:
 **/
public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDCheesePizza");
        System.out.println("LDCheesePizza prepare");
    }
}
