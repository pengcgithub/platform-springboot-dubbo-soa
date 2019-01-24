package com.platform.soa.order.dao;

import com.platform.soa.order.domain.OrderBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 订单ORM<br/>
 *
 * @author pengc
 * @see com.platform.soa.order.dao
 * @since 2019/1/24
 */
@Repository
public interface OrderDao extends CrudRepository<OrderBean, String> {

}
