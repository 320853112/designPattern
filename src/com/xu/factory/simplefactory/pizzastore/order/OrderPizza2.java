package com.xu.factory.simplefactory.pizzastore.order;

import com.xu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 13:48
 * @Description:
 **/
public class OrderPizza2 {
    private SimpleFactory simpleFactory;

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public OrderPizza2(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void order(){
        String orderType = getType();
        Pizza pizza = simpleFactory.createPizza(orderType);
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

    public static void main(String[] args) {
        OrderPizza2 orderPizza2 = new OrderPizza2(new SimpleFactory());
        orderPizza2.order();
    }
}
