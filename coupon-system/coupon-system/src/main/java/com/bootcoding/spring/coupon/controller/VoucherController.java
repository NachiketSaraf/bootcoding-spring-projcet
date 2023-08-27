package com.bootcoding.spring.coupon.controller;

import com.bootcoding.spring.coupon.model.Voucher;
import com.bootcoding.spring.coupon.service.VoucherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/voucher/")
public class VoucherController {

    @Autowired
    private VoucherService voucherService;

    @GetMapping("generate/new")
    public Voucher generateNewVoucher(){
        Voucher voucher = voucherService.generateNewVoucher();
      return voucher;
    }
    public VoucherService getVoucherService() {
        return voucherService;
    }
}
