package com.bootcoding.spring.coupon.controller;

import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coupon/") // Global Mapping
public class CouponController {
    @Autowired
    private CouponService couponService;


    @GetMapping("generate")
    public Coupon generateNewCoupon() {
        Coupon coupon = couponService.generateNewCoupon();
        return coupon;
    }

    @GetMapping("generate/{multi}")
    public List<Coupon> generateNewCoupon(@PathVariable int multi) {

        return couponService.generateNewCoupon(multi);

    }


    // 1. Get All Coupons
    @GetMapping("all")
    public List<Coupon> getAllCoupons() {
        return couponService.getAllCoupon();
    }

    // 2. Get Coupon Details by Coupon Id using PathVariable
    @GetMapping("coupon-id/{id}")
    public Optional<Coupon> getCouponById(@PathVariable int id) {
        return couponService.getById(id);
    }

    @PostMapping("set-coupon")
    public String setCoupon(@RequestBody Coupon coupon) {
        couponService.setCoupon(coupon);
        return "success";
    }

    // 3. Get Coupons with Filter (Query Parameter)
//    @GetMapping("search_coupon")
//    public String searchCoupon(
//            @RequestParam("valid") boolean isValid,
//            @RequestParam(value = "type", required = false) String couponType,
//            @RequestParam("category") String category) {
//        return "Query Parameter valid = " + isValid
//                + " | Coupon Type = " + couponType
//                + " | Coupon Category = " + category;
//    }


//    @GetMapping("getJson")
//    public Coupon getDummyJson() {
//        System.out.println("/getJson invoked");
//        return Coupon.builder()
//                .id(couponService.newCoupon())
//                .type("Voucher")
//                .validityDate(3).build();
//    }


    // http://localhost:8080/app-name/coupon/getCoupon
}
