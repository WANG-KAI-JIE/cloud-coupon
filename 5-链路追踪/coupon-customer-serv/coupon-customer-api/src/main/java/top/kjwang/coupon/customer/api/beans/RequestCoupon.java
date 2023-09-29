package top.kjwang.coupon.customer.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


/**
 * @author kjwang
 * @date 2023/9/8
 * @description RequestCoupon
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestCoupon {

    /**
     * 用户 id
     */
    @NotNull
    private Long userId;

    /**
     * 券模板 id
     */
    @NotNull
    private Long couponTemplateId;

    /**
     * Loadbalancer - 用作测试流量打标
     */
    //private String trafficVersion;

}
