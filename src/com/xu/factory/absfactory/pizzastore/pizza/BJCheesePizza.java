package com.xu.factory.absfactory.pizzastore.pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 16:58
 * @Description:
 **/
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJCheesePizza");
        System.out.println("BJCheesePizza prepare");
    }
}
