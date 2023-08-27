package com.bootcoding.spring.coupon;

import com.bootcoding.spring.coupon.service.CouponService;
import com.bootcoding.spring.coupon.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouponSystemApplication implements ApplicationRunner  {

    public static void main(String[] args) {
        SpringApplication.run(CouponSystemApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
