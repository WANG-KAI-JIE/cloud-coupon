package top.kjwang.coupon.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @author kjwang
 * @date 2023/9/14
 * @description Configuration
 **/
@org.springframework.context.annotation.Configuration
public class Configuration {
    /**
     * 注册一个 WebClient 的实例用来远程调用
     *
     * @return WebClient.Builder
     */
    @Bean
    @LoadBalanced
    public WebClient.Builder register() {
        return WebClient.builder();
    }
}
