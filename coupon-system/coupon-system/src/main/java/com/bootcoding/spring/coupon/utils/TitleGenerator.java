package com.bootcoding.spring.coupon.utils;

import java.util.Random;

public class TitleGenerator {

    private static String[] title = {"Percentage Discount", "Fixed Amount Discount",
            "Buy One Get One", "Free Shipping", "Bundle Discount",
            "First-Time Purchase", "Loyalty Reward", "Seasonal",
            "Referral Coupon",
            "Clearance Sale",
            "Birthday Coupon",
            "Flash Sale",
            "Conditional Coupon",
            "VIP Coupon",
            "Social Media Coupon"};

    public static String getTitle(){
        Random random = new Random();
        return title[random.nextInt(0,title.length-1)];
    }
}
