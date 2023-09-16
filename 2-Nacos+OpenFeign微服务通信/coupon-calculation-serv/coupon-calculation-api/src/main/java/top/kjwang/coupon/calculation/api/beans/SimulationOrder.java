package top.kjwang.coupon.calculation.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import top.kjwang.coupon.template.api.beans.CouponInfo;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author kjwang
 * @date 2023/9/8
 * @description SimulationOrder——试算订单最优的优惠券
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SimulationOrder {

    @NotEmpty
    private List<Product> products;

    @NotEmpty
    private List<Long> couponIDs;

    private List<CouponInfo> couponInfos;

    @NotNull
    private Long userId;
}