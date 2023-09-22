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
//		从服务请求的 Header 中获取 SentinelSource 变量的值，作为调用源的 name
		template.header("SentinelSource","coupon-customer-serv");
	}
}
