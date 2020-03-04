package com.xu.factory.absfactory.pizzastore.order;

import com.xu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.xu.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.xu.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.xu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: xuhang
 * @Date: 2020/3/3 0:17
 * @Description:
 **/
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderPizza) {
        Pizza pizza = null;
        if(orderPizza.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderPizza.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
