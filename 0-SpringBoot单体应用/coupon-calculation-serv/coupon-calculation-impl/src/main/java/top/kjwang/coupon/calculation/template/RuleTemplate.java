package top.kjwang.coupon.calculation.template;

import top.kjwang.coupon.calculation.api.beans.ShoppingCart;

/**
 * @author kjwang
 * @date 2023/9/8 16:46
 * @description RuleTemplate——模版规则接口
 */
public interface RuleTemplate {
	/**
	 * 计算优惠券
	 *
	 * @param settlement 传入的参数
	 * @return 返回的结果
	 */
	ShoppingCart calculate(ShoppingCart settlement);
}
