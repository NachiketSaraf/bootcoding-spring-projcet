package com.bootcoding.spring.coupon.utils;

import com.bootcoding.spring.coupon.model.Coupon;

import java.util.Random;

public class TypeGenerator {
    private static String[] type = {"Voucher", "Coupon"};

    public static String getType() {
        Random r = new Random();
        return type[r.nextInt(0, type.length - 1)];
    }
}
