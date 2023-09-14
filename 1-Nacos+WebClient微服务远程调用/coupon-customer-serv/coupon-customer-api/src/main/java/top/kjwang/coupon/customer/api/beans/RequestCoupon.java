package top.kjwang.coupon.customer.api.beans;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author kjwang
 * @date 2023/9/8 18:27
 * @description RequestCoupon
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCoupon {

	// 用户领券
	@NotNull
	private Long userId;

	// 券模版ID
	@NotNull
	private Long couponTemplateId;
}
