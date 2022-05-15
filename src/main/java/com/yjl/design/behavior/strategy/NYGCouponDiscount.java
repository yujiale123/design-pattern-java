package com.yjl.design.behavior.strategy;

import java.math.BigDecimal;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 * n元购购买
 */
public class NYGCouponDiscount implements ICouponDiscount<Double> {


    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
