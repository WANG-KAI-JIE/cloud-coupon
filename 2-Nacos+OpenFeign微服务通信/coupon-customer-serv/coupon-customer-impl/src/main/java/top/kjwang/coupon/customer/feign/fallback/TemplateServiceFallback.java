package top.kjwang.coupon.customer.feign.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import top.kjwang.coupon.customer.feign.TemplateService;
import top.kjwang.coupon.template.api.beans.CouponTemplateInfo;

import java.util.Collection;
import java.util.Map;

@Slf4j
@Component
public class TemplateServiceFallback implements TemplateService {
    @Override
    public CouponTemplateInfo getTemplate(Long id) {
        log.info("根据id获取优惠券模版降级逻辑");
        return null;
    }

    @Override
    public Map<Long, CouponTemplateInfo> getTemplateInBatch(Collection<Long> ids) {
        log.info("批量获取优惠券模版降级逻辑");
        return null;
    }
}
