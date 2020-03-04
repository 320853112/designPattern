package com.xu.factory.absfactory.pizzastore.order;

import com.xu.factory.absfactory.pizzastore.pizza.Pizza;

import java.util.Calendar;

/**
 * @Author: xuhang
 * @Date: 2020/3/3 0:21
 * @Description:
 **/
public class OrderPizza {
    public AbsFactory factory;

    public void setAbsFactory(AbsFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.setAbsFactory(new BJFactory());
        Pizza pizza = orderPizza.factory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
