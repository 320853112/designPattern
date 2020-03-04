package com.xu.factory.absfactory.pizzastore.pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 16:58
 * @Description:
 **/
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("LDPepperPizza");
        System.out.println("LDPepperPizza prepare");
    }
}
