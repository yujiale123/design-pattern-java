package com.yjl.design.behavior.strategy;

import java.math.BigDecimal;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 * 优惠卷金额计算
 */
public interface ICouponDiscount<T> {
    BigDecimal discountAmount(T couponInfo,BigDecimal skuPrice);
}
