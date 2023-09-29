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
 * @description ShoppingCart
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {

    @NotEmpty
    private List<Product> products;

    private Long couponId;

    private Long cost;

    /**
     * 目前只支持单张优惠券,为了以后的扩展考虑，可以添加多个优惠券的计算逻辑，所以用 List
     */
    private List<CouponInfo> couponInfos;

    @NotNull
    private Long userId;

}