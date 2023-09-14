package top.kjwang.coupon.customer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.kjwang.coupon.template.api.beans.CouponTemplateInfo;

import java.util.Collection;
import java.util.Map;

@FeignClient(value = "coupon-template-serv",path="/template")
public interface TemplateService {
    @GetMapping("/getTemplate")
    CouponTemplateInfo getTemplate(@RequestParam("id") Long id);
    @GetMapping("/getBatch")
    Map<Long,CouponTemplateInfo> getTemplateInBatch(@RequestParam("ids")Collection<Long> ids);
}
