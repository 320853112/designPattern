package com.xu.factory.absfactory.pizzastore.order;

import com.xu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: xuhang
 * @Date: 2020/3/3 0:16
 * @Description:
 **/
//一个抽象工厂模式的接口
public interface AbsFactory {
    Pizza createPizza(String orderPizza);
}
