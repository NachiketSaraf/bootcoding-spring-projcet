package com.bootcoding.spring.coupon.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    @Column(name = "coupon_code")
    private String couponCode;
    private String type;
    private String category;
    @Column(name = "validity_date")
    private Date validityDate;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "created_by")
    private String createdBy;
    private String status;
    @Column(name = "active")
    private boolean isActive;

}