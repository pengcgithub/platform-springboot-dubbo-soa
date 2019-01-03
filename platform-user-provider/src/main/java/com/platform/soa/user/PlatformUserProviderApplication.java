package com.platform.soa.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement
//@ComponentScan(basePackages = "com.platform.soa")
@SpringBootApplication
public class PlatformUserProviderApplication {

    public static void main(String[] args) {
//        SpringApplication.run(PlatformUserProviderApplication.class, args);
        new SpringApplicationBuilder(PlatformUserProviderApplication.class)
                .web(false) // 非 Web 应用
                .run(args);
    }

}

