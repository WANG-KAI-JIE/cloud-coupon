package top.kjwang.coupon.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import top.kjwang.coupon.calculation.api.beans.ShoppingCart;
import top.kjwang.coupon.calculation.api.beans.SimulationOrder;
import top.kjwang.coupon.calculation.api.beans.SimulationResponse;

@FeignClient(value = "coupon-calculation-serv",path="/calculator")
public interface CalculationService {
    @PostMapping("/checkout")
    ShoppingCart checkout(ShoppingCart settlement);
    @PostMapping("/simulate")
    SimulationResponse simulate(SimulationOrder simulator);
}
