package top.kjwang.coupon.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"top.kjwang"})
@EnableTransactionManagement
//扫描Dao  @Repostory注解
@EnableJpaRepositories(basePackages = {"top.kjwang"})
//扫描JPA @Entity，默认扫描本包当下路径
@EntityScan(basePackages = {"top.kjwang"})
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"top.kjwang"})
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class,args);
    }
}
