package com.xu.factory.factorymethod.pizzastore.pizza;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 13:13
 * @Description:
 **/
public abstract class Pizza {

    protected String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name+" bake");
    }
    public void cut(){
        System.out.println(name+" cut");
    }
    public void box(){
        System.out.println(name+" box");
    }

    protected void setName(String name) {
        this.name = name;
    }
}
