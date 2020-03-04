package com.xu.prototype.improve;

/**
 * @Author: xuhang
 * @Date: 2020/3/3 13:01
 * @Description:
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        try {
            Sheep sheep2 = (Sheep)sheep.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
