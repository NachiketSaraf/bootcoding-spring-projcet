package com.bootcoding.spring.coupon.utils;

import java.util.Random;

public class ActiveGenerator {
    private static boolean[] active={true,false};
    public static boolean getCategories(){
        Random random = new Random();
        return active[random.nextInt(0,active.length-1)];
    }
}
