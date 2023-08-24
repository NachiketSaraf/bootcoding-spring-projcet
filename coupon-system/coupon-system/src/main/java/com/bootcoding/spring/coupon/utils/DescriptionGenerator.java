package com.bootcoding.spring.coupon.utils;

import java.util.Random;

public class DescriptionGenerator {
    private static String[] description= {"5%", "10%", "15%", "20%", "25%",
            "30%", "35%", "40%", "45%", "50%",
            "55%", "60%", "65%", "70%", "75%",
            "80%", "85%", "90%"
    };

    public static String getDescription(){
        Random random = new Random();
        return description[random.nextInt(0,description.length-1)];
    }
}
