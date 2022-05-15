package com.yjl.design.behavior.strategy;

import java.math.BigDecimal;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 *
 * 外部传递不同的策略实现，经过统一的方法执行策略计算
 */
public class StrategyContext<T> {
    private ICouponDiscount<T> couponDiscount;


    public StrategyContext(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
