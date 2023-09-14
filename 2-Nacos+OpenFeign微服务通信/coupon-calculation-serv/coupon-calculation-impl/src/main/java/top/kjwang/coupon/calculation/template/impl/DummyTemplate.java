package top.kjwang.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.kjwang.coupon.calculation.template.AbstractRuleTemplate;
import top.kjwang.coupon.calculation.api.beans.ShoppingCart;
import top.kjwang.coupon.calculation.template.RuleTemplate;

@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {
    @Override
    public ShoppingCart calculate(ShoppingCart order){
        long orderTotalAmout=getTotalPrice(order.getProducts());
        order.setCost(orderTotalAmout);
        return order;
    }
    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return orderTotalAmount;
    }
}
