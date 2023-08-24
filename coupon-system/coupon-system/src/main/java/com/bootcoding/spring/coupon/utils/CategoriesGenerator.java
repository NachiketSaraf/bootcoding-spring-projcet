package com.bootcoding.spring.coupon.utils;

import java.util.Random;

public class CategoriesGenerator {
    private static String[] couponCategories = {
            "Apparel and Fashion",
            "Electronics",
            "Home and Living",
            "Food and Dining",
            "Travel and Hospitality",
            "Beauty and Personal Care",
            "Health and Fitness",
            "Entertainment",
            "Automotive",
            "Books and Stationery",
            "Gifts and Flowers",
            "Sports and Outdoors",
            "Kids and Toys",
            "Pets",
            "Tech Services",
            "Subscription Services",
            "Special Occasions",
            "Local Services",
            "Exclusive/VIP",
            "Clearance",
            "Seasonal"
    };
    public static String getCategories(){
        Random random = new Random();
        return couponCategories[random.nextInt(0,couponCategories.length-1)];
    }

}
