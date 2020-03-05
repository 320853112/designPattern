package com.xu.prototype.improve;

/**
 * @Author: xuhang
 * @Date: 2020/3/3 13:01
 * @Description:
 **/
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "白色");
        sheep.setFriend(new Sheep("tory", 2, "黑色"));
        try {
            Sheep sheep2 = (Sheep)sheep.clone();
            System.out.println(sheep.getFriend().hashCode());
            System.out.println(sheep2.getFriend().hashCode());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
