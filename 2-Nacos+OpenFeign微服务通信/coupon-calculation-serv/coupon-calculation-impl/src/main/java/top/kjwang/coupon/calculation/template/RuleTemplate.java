package top.kjwang.coupon.calculation.template;

import top.kjwang.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {
    ShoppingCart calculate(ShoppingCart settlement);
}
