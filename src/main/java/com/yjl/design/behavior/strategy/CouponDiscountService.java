package com.yjl.design.behavior.strategy;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 * <p>
 *     经典做法
 * 优惠券折扣计算接⼝ * <p> * 优惠券类型； * 1. 直减券 * 2. 满减券 * 3. 折扣券 * 4. n元购
 */
public class CouponDiscountService {

    /**
     *
     * @param type 优惠卷类型
     * @param typeContent 优惠卷金额
     * @param skuPrice 商品金额
     * @param typeExt 满减
     * @return
     */
    public double discountAmount(Integer type, Double typeContent, Double skuPrice, Double typeExt) {
        if (1 == type) {
            return skuPrice - typeContent;
        } else if (2 == type) {
            if (skuPrice < typeExt) {
                return skuPrice;
            } else {
                return skuPrice - typeContent;
            }
        } else if (3 == type) {
            return skuPrice * typeContent;
        } else if (4 == type) {
            return typeContent;
        }
        return 0D;
    }
}
