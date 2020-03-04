package com.xu.factory.factorymethod.pizzastore.order;

import com.xu.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import com.xu.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import com.xu.factory.factorymethod.pizzastore.pizza.Pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 17:43
 * @Description:
 **/
public class BJOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
