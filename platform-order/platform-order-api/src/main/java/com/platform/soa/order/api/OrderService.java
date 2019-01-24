package com.platform.soa.order.api;

import com.platform.soa.order.domain.OrderBean;

/**
 * 订单<br/>
 *
 * @author pengc
 * @see com.platform.soa.user.api
 * @since 2018/12/27
 */
public interface OrderService {

    Boolean saveOrderInfo(OrderBean orderBean) throws Exception;

}
