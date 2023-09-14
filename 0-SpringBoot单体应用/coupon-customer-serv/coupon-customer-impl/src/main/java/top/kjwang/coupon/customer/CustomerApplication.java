package top.kjwang.coupon.customer;

import lombok.Data;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author kjwang
 * @date 2023/9/9 18:57
 * @description CustomerApplication
 */

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = {"top.kjwang"})
@EnableTransactionManagement
// 用于扫描Dao @Repository 注解
@EnableJpaRepositories(basePackages = {"top.kjwang"})
// 用于扫描JAP实体类 @Entity，默认扫本包当下路径
@EntityScan(basePackages = {"top.kjwang"})
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class,args);
	}
}
