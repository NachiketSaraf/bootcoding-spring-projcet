package com.bootcoding.spring.coupon.utils;

import java.util.Random;

public class CreatedByGenerator {
    private static String[] creators = {
            "System",
            "Admin",
            "Random",
            "User"
    };

    public static String getCreator(){
        Random random = new Random();
        return creators[random.nextInt(0,creators.length-1)];
    }



}
