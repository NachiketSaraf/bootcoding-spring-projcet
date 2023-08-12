package com.bootcoding.service;

import com.bootcoding.model.Coupon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CouponService {

    @Autowired
    private Coupon c ;
    public String callCoupon(){
        return c.name();
    }

}
