package com.xu.JDKsrc;

import java.util.Calendar;

/**
 * @Author: xuhang
 * @Date: 2020/3/3 0:26
 * @Description:
 **/
public class Factory {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
    }
}
