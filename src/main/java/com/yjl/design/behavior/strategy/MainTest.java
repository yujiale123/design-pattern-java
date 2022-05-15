package com.yjl.design.behavior.strategy;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-patter-demo
 * @author: yjl
 * @created: 2022/05/14
 * 策略模式测试类
 */
public class MainTest {
    public static void main(String[] args) {
        MJCouponDiscount mjCouponDiscount = new MJCouponDiscount();
        StrategyContext<Map<String, String>> mjStrategyContext = new StrategyContext<>(mjCouponDiscount);
        HashMap<String, String> map = new HashMap<>();
        map.put("x", "100");
        map.put("o", "10");
        BigDecimal mjBigDecimal = mjCouponDiscount.discountAmount(map, new BigDecimal(9));
        System.out.println("满减优惠卷测试结果：" + mjBigDecimal);
        System.out.println("===============");

        NYGCouponDiscount nygCouponDiscount = new NYGCouponDiscount();
        StrategyContext<Double> doubleStrategyContext = new StrategyContext<>(nygCouponDiscount);
        BigDecimal nygBigDecimal = doubleStrategyContext.discountAmount(10D, new BigDecimal(100));
        System.out.println("n 元购优惠卷测试结果：" + nygBigDecimal);
        System.out.println("===============");

        ZJCouponDiscount zjCouponDiscount = new ZJCouponDiscount();
        StrategyContext<Double> zjStrategyContext = new StrategyContext<>(zjCouponDiscount);
        BigDecimal zjBigDecimal = zjStrategyContext.discountAmount(10D, new BigDecimal(100));
        System.out.println("直减优惠卷测试结果：" + zjBigDecimal);
        System.out.println("===============");

        ZKCouponDiscount zkCouponDiscount = new ZKCouponDiscount();
        StrategyContext<Double> zkStrategyContext = new StrategyContext<>(zkCouponDiscount);
        BigDecimal zkBigDecimal = zkStrategyContext.discountAmount(0.9D, new BigDecimal(100));
        System.out.println("折扣9折优惠卷测试结果：" + zkBigDecimal);

    }
}
