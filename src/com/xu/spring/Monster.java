package com.xu.spring;

/**
 * @Author: xuhang
 * @Date: 2020/3/4 12:30
 * @Description:
 **/
public class Monster {
    private Integer id = 10;
    private String nickname = "牛魔王";
    private String skill = "芭蕉扇";
    public Monster(){
        System.out.println("build");
    }

    public Monster(Integer id, String nickname, String skill) {
        this.id = id;
        this.nickname = nickname;
        this.skill = skill;
    }
}
