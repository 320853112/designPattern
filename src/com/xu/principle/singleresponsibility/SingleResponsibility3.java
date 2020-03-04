package com.xu.principle.singleresponsibility;

/**
 * @Author: xuhang
 * @Date: 2020/2/20 20:40
 * @Description:
 **/
//单一职责原则的好处
//    1.降低类的复杂度
//    2.提高类的可读性和可维护性
//    3.由于职责之间独立了，就降低了变更代码所引起的风险
//    4.在逻辑十分简单，且不是十分的考虑扩展的话，可以打破改原则
//    5.可以在类的级别或方法的级别遵守单一职责原则
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.runRoad("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}

class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle+" 在公路上运行。。。");
    }

    public void runWater(String vehicle){
        System.out.println(vehicle+" 在水中上运行。。。");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+" 在天空中运行。。。");
    }
}
