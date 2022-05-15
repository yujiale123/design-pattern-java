package com.yjl.design.behavior.strategy;

import java.math.BigDecimal;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 * 直减计算 * 1. 使⽤商品价格减去优惠价格 * 2. 最低⽀付⾦额1元
 */
public class ZJCouponDiscount implements ICouponDiscount<Double> {
    @Override

    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        //使⽤商品价格减去优惠价格
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        // 判断金额是否小于 1，如果小于 1，则返回 1，最低支付金额，否则返回减去后的价格
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
