package top.kjwang.coupon.customer.api.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author kjwang
 * @date 2023/9/8
 * @description SearchCoupon
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchCoupon {

    @NotNull
    private Long userId;

    private Long shopId;

    private Integer couponStatus;
}
