package com.xu.singleton;

/**
 * @Author: xuhang
 * @Date: 2020/2/28 12:36
 * @Description:
 **/
public class Type2 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }
}

//饿汉式，（静态变量）
class Singleton2{
    //1.构造器私有化
    private Singleton2(){

    }
    private  static Singleton2 instance ;

    static {
        instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return instance;
    }
}