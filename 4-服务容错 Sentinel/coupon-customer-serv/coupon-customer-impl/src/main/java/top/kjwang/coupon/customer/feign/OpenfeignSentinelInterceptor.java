package top.kjwang.coupon.customer.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

/**
 * @author kjwang
 * @date 2023/9/21 15:46
 * @description OpenfeignSentinelInterceptor
 */

@Configuration
public class OpenfeignSentinelInterceptor implements RequestInterceptor {

	@Override
	public void apply(RequestTemplate template) {
		template.header("SentinelSource","coupon-custom-serv");
	}
}
