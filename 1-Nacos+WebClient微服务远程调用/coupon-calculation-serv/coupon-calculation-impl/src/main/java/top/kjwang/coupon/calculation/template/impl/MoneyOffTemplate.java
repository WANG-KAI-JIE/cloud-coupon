package top.kjwang.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.kjwang.coupon.calculation.template.AbstractRuleTemplate;
import top.kjwang.coupon.calculation.template.RuleTemplate;

/**
 * @author kjwang
 * @date 2023/9/8 16:58
 * @description MoneyOffTemplate
 */

@Slf4j
@Component
public class MoneyOffTemplate extends AbstractRuleTemplate implements RuleTemplate {
	@Override
	protected Long calculateNewPrice(Long totalAmount, Long shopAmount, Long quota) {
		// benefitAmount 是扣减的价格
		// 如果当前门店的商品总价 < quota，那么最多只能扣减 shopAmount 的钱数
		Long benefitAmount = shopAmount < quota ? shopAmount : quota;
		return totalAmount - benefitAmount;
	}
}
