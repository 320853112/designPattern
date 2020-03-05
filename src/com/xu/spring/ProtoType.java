package com.xu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: xuhang
 * @Date: 2020/3/4 12:46
 * @Description:
 **/
public class ProtoType {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        Object bean1 = applicationContext.getBean("id01");
        Object bean2 = applicationContext.getBean("id01");
        System.out.println("bean"+bean1);
        System.out.println(bean1 == bean2);
    }
}
