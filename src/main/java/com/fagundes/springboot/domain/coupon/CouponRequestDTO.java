package com.fagundes.springboot.domain.coupon;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}