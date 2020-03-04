package com.xu.factory.absfactory.pizzastore.pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 16:58
 * @Description:
 **/
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("BJPepperPizza");
        System.out.println("BJPepperPizza prepare");
    }
}
