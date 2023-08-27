package com.bootcoding.spring.coupon.service;

import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.model.Voucher;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.UUID;

@Component
public class VoucherService {

    public Voucher generateNewVoucher() {
        Voucher voucher = Voucher.builder()
                .id(UUID.randomUUID().toString())
                .validFor(5 + new Random().nextInt(90))
                .title("COUPON")
                .category("Discount")
                .discount(99)
                .build();
        return voucher;
    }
}
