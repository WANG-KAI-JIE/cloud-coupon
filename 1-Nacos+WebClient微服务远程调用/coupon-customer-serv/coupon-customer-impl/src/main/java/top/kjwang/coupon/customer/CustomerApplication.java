package top.kjwang.coupon.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import top.kjwang.coupon.customer.loadbalance.CanaryRuleConfiguration;

/**
 * @author kjwang
 */
@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"top.kjwang"})
@EnableTransactionManagement
//用于扫描Dao @Repository 注解
@EnableJpaRepositories(basePackages = {"top.kjwang"})
//用于扫描JPA实体类 @Entity，默认扫本包当下路径
@EntityScan(basePackages = {"top.kjwang"})

// 中定义的负载 // 发到 coupon-template-serv 的调用，会使用 CanaryRuleConfiguration均衡 Rule
@LoadBalancerClient(value = "coupon-template-serv",configuration = CanaryRuleConfiguration.class)
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}