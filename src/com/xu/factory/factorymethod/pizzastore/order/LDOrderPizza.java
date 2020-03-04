package com.xu.factory.factorymethod.pizzastore.order;

import com.xu.factory.factorymethod.pizzastore.pizza.*;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 17:43
 * @Description:
 **/
public class LDOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return null;
    }
}
