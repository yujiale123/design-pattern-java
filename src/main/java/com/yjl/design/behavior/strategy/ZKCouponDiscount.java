package com.yjl.design.behavior.strategy;

import java.math.BigDecimal;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 * 折扣优惠卷
 */
public class ZKCouponDiscount implements ICouponDiscount<Double> {
    @Override
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        // 使⽤商品价格乘以折扣⽐例，为最后⽀付⾦额并保留两位⼩数
        BigDecimal discountAmount = skuPrice.multiply(new BigDecimal(couponInfo)).setScale(2, BigDecimal.ROUND_HALF_UP);
        //最低⽀付⾦额1元
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
