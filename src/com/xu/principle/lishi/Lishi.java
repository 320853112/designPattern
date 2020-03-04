package com.xu.principle.lishi;

/**
 * @Author: xuhang
 * @Date: 2020/2/24 23:48
 * @Description:
 **/
public class Lishi {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3));
        System.out.println("1-8="+a.func1(1,8));
        System.out.println("------");
        B b = new B();
        System.out.println("11-3="+b.func1(11,3));
        System.out.println("1-8="+b.func1(1,8));
        System.out.println("11+3+9="+b.func2(11,3));
    }
}

//第一个数字减第二个的值
class A {
    public int func1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends A{
    @Override
    public int func1(int num1, int num2) {
        return num1+num2;
    }

    public int func2(int num1 ,int num2){
        return func1(num1,num2)+9;
    }
}


