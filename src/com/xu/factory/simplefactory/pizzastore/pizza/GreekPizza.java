package com.xu.factory.simplefactory.pizzastore.pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 13:14
 * @Description:
 **/
public class GreekPizza extends Pizza{

    @Override
    public void prepare() {
        setName("GreekPizza");
        System.out.println("GreekPizza prepare");
    }
}
