package top.kjwang.coupon.customer;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author kjwang
 * @date 2023/9/14
 * @description Configuration
 **/
// Configuration注解用于定义配置类
// 类中定义的Bean方法会被AnnotationConfigApplicationContext和AnnotationConfigWebApplicationContext扫描并初始化
@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }

}
