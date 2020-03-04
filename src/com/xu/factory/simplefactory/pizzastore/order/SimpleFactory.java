package com.xu.factory.simplefactory.pizzastore.order;

import com.xu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xu.factory.simplefactory.pizzastore.pizza.Pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 13:44
 * @Description:
 **/
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if(orderType.equals("GreekPizza")){
            pizza = new GreekPizza();
        }else if (orderType.equals("CheesePizza")){
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
