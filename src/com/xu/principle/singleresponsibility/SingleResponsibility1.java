package com.xu.principle.singleresponsibility;

/**
 * @Author: xuhang
 * @Date: 2020/2/20 19:57
 * @Description:
 **/
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");


    }
}

//交通工具类
//出现了陆地的交通工具和天空交通工具两个职责
//如果使用一个类的一个函数，那么负责了两个职责，不便于以后的扩展和维护，容易杂糅
class Vehicle {

    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行。。。");
    }
}
