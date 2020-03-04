package com.xu.principle.singleresponsibility;

/**
 * @Author: xuhang
 * @Date: 2020/2/20 20:33
 * @Description:
 **/
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
    }
}

//遵守了单一职责原则，但是解耦的太彻底，将类分解后，也要修改客户端，可以使用拆分成不同方法来解决
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在公路上运行。。。");
    }
}

class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+" 在天空中运行。。。");
    }
}
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在水中运行。。。");
    }
}