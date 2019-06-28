package com.platform.soa.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * platform-user-provider启动类<br/>
 *
 * @author pengc
 * @see com.platform.soa.order.service
 * @since 2019/1/3
 */
@MapperScan(basePackages = "com.platform.soa.user.mapper")
@EnableDubbo
@EnableHystrix
@EnableTransactionManagement
@ComponentScan(basePackages = "com.platform.soa.user.service")
//@EnableJpaRepositories(basePackages = "com.platform.soa.user.dao")
//@EntityScan(basePackages = "com.platform.soa.user.domain")
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class PlatformUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformUserProviderApplication.class, args);
//        new SpringApplicationBuilder(PlatformUserProviderApplication.class)
//                .web(false)
//                .run(args);
    }

}

