package top.kjwang.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.kjwang.coupon.calculation.api.beans.ShoppingCart;
import top.kjwang.coupon.calculation.template.AbstractRuleTemplate;
import top.kjwang.coupon.calculation.template.RuleTemplate;

/**
 * @author kjwang
 * @date 2023/9/8
 * @description DummyTemplate——空实现
 **/
@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    public ShoppingCart calculate(ShoppingCart order) {
        // 获取订单总价
        long orderTotalAmount = getTotalPrice(order.getProducts());
        order.setCost(orderTotalAmount);
        return order;
    }


    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return orderTotalAmount;
    }
}