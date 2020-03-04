package com.xu.principle.inversion;

/**
 * @Author: xuhang
 * @Date: 2020/2/21 11:53
 * @Description:
 **/
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}


//完成person接收消息的功能
//方式1完成
//receive和email直接关联，就会导致再接受其他消息的时候，要新增类，并且person中要新增方法
//解决思路：引入一个抽象接口IReceiver,表示接收者，这样Person类与接口IReceiver发生依赖

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：hello world ";
    }
}