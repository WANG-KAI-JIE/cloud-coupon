package top.kjwang.coupon.calculation.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import top.kjwang.coupon.calculation.api.beans.ShoppingCart;
import top.kjwang.coupon.calculation.api.beans.SimulationOrder;
import top.kjwang.coupon.calculation.api.beans.SimulationResponse;

public interface CouponCalculationService {
    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);
    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
