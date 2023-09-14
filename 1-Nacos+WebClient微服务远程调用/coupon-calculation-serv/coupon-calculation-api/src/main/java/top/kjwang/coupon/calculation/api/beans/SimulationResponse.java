package top.kjwang.coupon.calculation.api.beans;

import com.google.common.collect.Maps;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @author kjwang
 * @date 2023/9/8 16:38
 * @description SimulationResponse
 */

@Data
@NoArgsConstructor
public class SimulationResponse {

	/**
	 * 最省钱的 coupon id
	 */
	private Long bestCouponId;

	/**
	 * 每一个 coupon 对应的 order 价格
	 */
	private Map<Long,Long> couponToOrderPrice = Maps.newHashMap();
}
