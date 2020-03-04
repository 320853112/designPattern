package com.xu.factory.simplefactory.pizzastore.order;

import com.xu.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.xu.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.xu.factory.simplefactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 13:18
 * @Description:
 **/
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            if(orderType.equals("GreekPizza")){
                 pizza = new GreekPizza();
            }else if (orderType.equals("CheesePizza")){
                pizza = new CheesePizza();
            } else{
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }


    private String getType(){
        System.out.println("input pizza type:");
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        return type;
    }

}
