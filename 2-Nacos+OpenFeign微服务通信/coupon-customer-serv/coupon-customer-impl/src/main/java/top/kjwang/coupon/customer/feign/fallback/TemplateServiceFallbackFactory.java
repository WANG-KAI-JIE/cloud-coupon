package top.kjwang.coupon.customer.feign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;
import top.kjwang.coupon.customer.feign.TemplateService;
import top.kjwang.coupon.template.api.beans.CouponTemplateInfo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kjwang
 * @date 2023/9/15
 * @description TemplateServiceFallback
 **/
@Slf4j
@Component
public class TemplateServiceFallbackFactory implements FallbackFactory<TemplateService> {
    @Override
    public TemplateService create(Throwable cause) {
        return new TemplateService() {
            @Override
            public CouponTemplateInfo getTemplate(Long id) {
                log.info("执行根据id查询优惠券降级逻辑" + cause);
                return CouponTemplateInfo.builder().id(123L).name("降级优惠券").desc("一张降级优惠券").type("折扣").shopId(123L).rule(null).available(true).build();
            }

            @Override
            public Map<Long, CouponTemplateInfo> getTemplateInBatch(Collection<Long> ids) {
                log.info("执行根据批量查询优惠券降级逻辑" + cause);
                Map<Long, CouponTemplateInfo> map = new HashMap<>();
                map.put(1L, CouponTemplateInfo.builder().id(123L).name("降级优惠券").desc("一张降级优惠券").type("折扣").shopId(123L).rule(null).available(true).build());
                return map;
            }
        };
    }
}
