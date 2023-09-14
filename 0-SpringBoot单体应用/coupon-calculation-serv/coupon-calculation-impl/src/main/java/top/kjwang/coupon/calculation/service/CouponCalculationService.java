package top.kjwang.coupon.calculation.service;

import org.springframework.web.bind.annotation.RequestBody;
import top.kjwang.coupon.calculation.api.beans.ShoppingCart;
import top.kjwang.coupon.calculation.api.beans.SimulationOrder;
import top.kjwang.coupon.calculation.api.beans.SimulationResponse;

/**
 * @author kjwang
 * @date 2023/9/8 18:08
 * @description CouponCalculationService
 */
public interface CouponCalculationService {
	ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

	SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
