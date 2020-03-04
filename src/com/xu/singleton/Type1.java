package com.xu.singleton;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 12:36
 * @Description:
 **/
public class Type1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}

//饿汉式，（静态变量）
class Singleton{
    //1.构造器私有化
    private Singleton(){

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}