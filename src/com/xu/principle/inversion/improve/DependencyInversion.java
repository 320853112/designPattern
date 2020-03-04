package com.xu.principle.inversion.improve;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @Author: xuhang
 * @Date: 2020/2/21 13:42
 * @Description:
 **/
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Wechat());
    }
}

interface  IReceiver {
    public String getInfo();
}

class Person{
    public void receive(IReceiver message){
        System.out.println(message.getInfo());
    }
}

class Email implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件信息：hello world ";
    }
}

class Wechat implements IReceiver{
    @Override
    public String getInfo(){
        return "微信信息：hi world ";
    }
}
