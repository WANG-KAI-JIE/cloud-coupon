package top.kjwang.coupon.customer;

import feign.Logger;
import org.springframework.context.annotation.Bean;


@org.springframework.context.annotation.Configuration

public class Configuration {
    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
}
