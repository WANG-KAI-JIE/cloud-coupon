package top.kjwang.coupon.template.api.beans;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 封装优惠券模板的基本信息
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponInfo {
    private Long id;
    private Long templateId;
    private Long userId;
    private Long shopId;
    private Integer status;
    private CouponTemplateInfo template;
}
