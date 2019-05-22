package com.platform.soa.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * platform-user-consumer启动类<br/>
 *
 * @author pengc
 * @see com.platform.soa.order.service
 * @since 2019/1/3
 */
@EnableDubbo
@EnableWebMvc
@ComponentScan(basePackages = "com.platform.soa")
@SpringBootApplication(
        exclude={DataSourceAutoConfiguration.class,
                HibernateJpaAutoConfiguration.class,
                MongoAutoConfiguration.class},
        scanBasePackages="com.platform.soa.user.controller")
public class PlatformUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformUserConsumerApplication.class, args);
    }

}

