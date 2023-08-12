package com.bootcoding;

import com.bootcoding.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.security.Provider;

@SpringBootApplication
public class CouponSystemApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(CouponSystemApplication.class, args);
    }

    @Autowired
	private CouponService couponService;
    @Override
    public void run(ApplicationArguments args) throws Exception {
		System.out.println(couponService.callCoupon());
        System.out.println("Hello Spring");
    }
}
