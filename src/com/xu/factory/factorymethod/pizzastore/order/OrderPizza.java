package com.xu.factory.factorymethod.pizzastore.order;

import com.xu.factory.factorymethod.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 17:01
 * @Description:
 **/
public abstract class OrderPizza {
    //定义一个抽象方法，createPizza,让各个工程类自己实现
    abstract Pizza createPizza(String orderType);

    public OrderPizza() {
        String orderType = getType();
        Pizza pizza = createPizza(orderType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    private String getType(){
        System.out.println("input pizza type:");
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        return type;
    }
}
