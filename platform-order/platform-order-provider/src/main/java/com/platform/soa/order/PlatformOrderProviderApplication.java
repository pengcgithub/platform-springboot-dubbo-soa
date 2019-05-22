package com.platform.soa.order;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * platform-order-provider启动类<br/>
 *
 * @author pengc
 * @see com.platform.soa.order.service
 * @since 2019/1/3
 */
@EnableDubbo
@EnableTransactionManagement
@ComponentScan(basePackages = "com.platform.soa.order.service")
@EnableJpaRepositories(basePackages = "com.platform.soa.order.dao")
@EntityScan(basePackages = "com.platform.soa.order.domain")
@SpringBootApplication
public class PlatformOrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformOrderProviderApplication.class, args);
    }

}

