package top.kjwang.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.kjwang.coupon.calculation.template.AbstractRuleTemplate;
import top.kjwang.coupon.calculation.template.RuleTemplate;

import java.util.Calendar;

/**
 * @author kjwang
 * @date 2023/9/8 17:56
 * @description NightTemplate
 */

@Slf4j
@Component
public class NightTemplate extends AbstractRuleTemplate implements RuleTemplate {
	@Override
	protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
		Calendar calendar = Calendar.getInstance();
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);

		if (hourOfDay == 23 || hourOfDay < 2){
			quota += 2;
		}

		Long benefitAmount = shopTotalAmount < quota ? shopTotalAmount : quota;
		return orderTotalAmount - benefitAmount;
	}
}
