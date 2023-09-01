package com.bootcoding.spring.coupon.service;

import com.bootcoding.spring.coupon.model.Coupon;
import com.bootcoding.spring.coupon.repository.CouponRepository;
import com.bootcoding.spring.coupon.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;

    public Coupon generateNewCoupon() {
        Coupon coupon = Coupon.builder()
                .isActive(ActiveGenerator.getActive())
                .title(TitleGenerator.getTitle())
                .createdBy(CreatedByGenerator.getCreator())
                .createdDate(CreatedDateGenerator.createdDate())
                .couponCode(CouponCodeGenerator.generateNewCoupon())
                .description(DescriptionGenerator.getDescription())
                .category(CategoriesGenerator.getCategories())
                .status(StatusGenerator.getStatus())
                .type(TypeGenerator.getType())
                .validityDate(ValidityDateGenerator.getValidity())
                .build();
        return couponRepository.save(coupon);
    }

    public List<Coupon> generateNewCoupon(int multi) {
        List<Coupon> couponList = new ArrayList<>();
        for (int i = 0; i < multi ; i++) {
            couponList.add(generateNewCoupon());
        }
        couponRepository.saveAll(couponList);
        return couponList;
    }

    public List<Coupon> getAllCoupon() {
        return couponRepository.findAll();
    }

    public Optional<Coupon> getById(int id) {
        return couponRepository.findById(id);
    }

    public void setCoupon(Coupon coupon) {
        couponRepository.save(coupon);
    }
}