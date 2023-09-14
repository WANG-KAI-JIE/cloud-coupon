package top.kjwang.coupon.customer.converter;

import top.kjwang.coupon.customer.dao.entity.Coupon;
import top.kjwang.coupon.template.api.beans.CouponInfo;

/**
 * @author kjwang
 * @date 2023/9/9 18:48
 * @description CouponConverter
 */
public class CouponConverter {
	public static CouponInfo convertToCoupon(Coupon coupon){
		return CouponInfo.builder()
				.id(coupon.getId())
				.status(coupon.getStatus().getCode())
				.templateId(coupon.getShopId())
				.userId(coupon.getShopId())
				.template(coupon.getTemplateInfo())
				.build();
	}
}
