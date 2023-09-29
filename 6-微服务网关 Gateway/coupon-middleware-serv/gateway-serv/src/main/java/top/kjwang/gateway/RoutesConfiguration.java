package top.kjwang.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.ZonedDateTime;

/**
 * @author kjwang
 * @date 2023/9/28 08:49
 * @description RoutesConfiguration
 */

@Configuration
public class RoutesConfiguration {
	@Bean
	public RouteLocator declare(RouteLocatorBuilder builder){
		return builder.routes()
				.route(route -> route
//						.after(ZonedDateTime.parse("2023-12-12T14:33:33+08:00"))
//						.and()
//						/gateway/与Controller中保持一致，例如：@RequestMapping("coupon-customer")
						.path("/gateway/coupon-customer/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://coupon-customer-serv")
				).route(route -> route
//						.order(1)
						.path("/gateway/template/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://coupon-template-serv")
				).route(route -> route
//						.order(1)
						.path("/gateway/calculator/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://coupon-calculation-serv")
				).build();
	}
}