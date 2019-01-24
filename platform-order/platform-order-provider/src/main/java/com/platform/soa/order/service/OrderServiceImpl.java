package com.platform.soa.order.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.platform.soa.order.api.OrderService;
import com.platform.soa.order.dao.OrderDao;
import com.platform.soa.order.domain.OrderBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 订单业务逻辑<br/>
 *
 * @author pengc
 * @see com.platform.soa.order.service
 * @since 2019/1/24
 */
@Slf4j
@Service(
        version = "${platform.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Boolean saveOrderInfo(OrderBean orderBean) throws Exception {
        try {
            orderDao.save(orderBean);
        } catch (Exception e) {
            log.error("save error:{}", e.getMessage());
            log.error("save param:{}", orderDao.toString());
            throw e;
        }
        return Boolean.TRUE;
    }
}
