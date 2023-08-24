package com.bootcoding.spring.coupon.utils;

import java.util.Random;

public class StatusGenerator {
    private static String[] couponStatuses = {
            "Active",
            "Expired",
            "Used",
            "Invalid",
            "Redeemed",
            "Pending",
            "Inactive",
            "Suspended",
            "Canceled",
            "Out of Stock",
            "Exhausted",
            "Pending Approval",
            "Rejected",
            "Restricted",
            "Unclaimed",
            "Single Use",
            "Multi-Use",
            "Exclusive",
            "Public",
            "Limited-Time"
    };
    public static String getStatus(){
        Random random = new Random();
        return couponStatuses[random.nextInt(0,couponStatuses.length-1)];
    }
}
