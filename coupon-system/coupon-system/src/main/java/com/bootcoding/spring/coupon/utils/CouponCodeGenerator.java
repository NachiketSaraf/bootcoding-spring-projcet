package com.bootcoding.spring.coupon.utils;

import java.util.UUID;

public class CouponCodeGenerator {
    public static String generateNewCoupon() {
        int desiredLength = 10; // Adjust the desired length as needed
        UUID uuid = UUID.randomUUID();
        String limitedUuid = uuid.toString().replace("-", "").substring(0, desiredLength);
        return limitedUuid;
    }


}
