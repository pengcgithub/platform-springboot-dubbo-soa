package com.platform.soa.order.config;

import com.platform.soa.common.util.ServiceExceptionUtil;
import com.platform.soa.order.constant.OrderErrorCodeEnum;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;

@Configuration
public class ServiceExceptionConfiguration {

    @EventListener(ApplicationReadyEvent.class) // 可参考 https://www.cnblogs.com/ssslinppp/p/7607509.html
    public void initMessages() {
        for (OrderErrorCodeEnum item : OrderErrorCodeEnum.values()) {
            ServiceExceptionUtil.put(item.getCode(), item.getMessage());
        }
    }
}
