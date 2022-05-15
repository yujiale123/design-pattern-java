package com.yjl.design.behavior.strategy;

import java.math.BigDecimal;
import java.util.Map;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 * 满减优惠卷实现
 */
public class MJCouponDiscount implements ICouponDiscount<Map<String, String>> {
    @Override
    public BigDecimal discountAmount(Map<String, String> couponInfo, BigDecimal skuPrice) {

        String x = couponInfo.get("x");
        String o = couponInfo.get("o");
        // 判断商品价格是否达到满减金额标准，如果达不到，直接返回商品金额
        if (skuPrice.compareTo(new BigDecimal(x)) < 0) {
            return skuPrice;
        }
        // 商品价格减去满减金额
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(o));
        // 最低⽀付⾦额1元
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
