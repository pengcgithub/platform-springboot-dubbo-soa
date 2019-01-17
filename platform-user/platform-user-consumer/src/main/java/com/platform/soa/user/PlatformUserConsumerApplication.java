package com.platform.soa.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDubbo
@EnableWebMvc
@ComponentScan(basePackages = "com.platform.soa")
@SpringBootApplication(
        exclude={DataSourceAutoConfiguration.class,
                HibernateJpaAutoConfiguration.class},
        scanBasePackages="com.platform.soa.user.controller")
public class PlatformUserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlatformUserConsumerApplication.class, args);
        // Fail to start qos server
//        ApplicationConfig config = new ApplicationConfig();
//        config.setName("gps_web");
//        config.setQosEnable(false);
//        config.setQosAcceptForeignIp(false);
//        config.setQosPort(8000);
    }

}

