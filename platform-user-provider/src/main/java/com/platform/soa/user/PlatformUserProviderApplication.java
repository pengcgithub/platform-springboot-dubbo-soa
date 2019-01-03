package com.platform.soa.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan(basePackages = "com.platform.soa.user.service")
@EnableJpaRepositories(basePackages = "com.platform.soa.user.dao")
@EntityScan(basePackages = "com.platform.soa.user.domain")
@SpringBootApplication
public class PlatformUserProviderApplication {

    public static void main(String[] args) {
//        SpringApplication.run(PlatformUserProviderApplication.class, args);
        new SpringApplicationBuilder(PlatformUserProviderApplication.class)
//                .web(false)
                .run(args);
    }

}

