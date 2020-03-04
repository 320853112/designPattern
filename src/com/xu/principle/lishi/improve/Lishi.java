package com.xu.principle.lishi.improve;

/**
 * @Author: xuhang
 * @Date: 2020/2/25 0:00
 * @Description:
 **/
public class Lishi {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("------");
        B b = new B();
        System.out.println("11+3="+b.func1(11,3));
        System.out.println("1+8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}

class Base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

//第一个数字减第二个的值
class A extends Base{
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends Base{
    //如果B需要使用到A类的方法，使用组合的方式实现

    private A a = new A();

    public int func1(int num1, int num2) {
        return num1+num2;
    }

    public int func2(int num1 ,int num2){
        return func1(num1,num2)+9;
    }

    public int func3(int num1 ,int num2){
        return this.a.func1(num1,num2);
    }

}
