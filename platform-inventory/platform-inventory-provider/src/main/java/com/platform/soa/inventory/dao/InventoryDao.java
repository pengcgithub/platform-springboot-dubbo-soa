package com.platform.soa.inventory.dao;

import com.platform.soa.inventory.domain.InventoryBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * 库存ORM<br/>
 *
 * @author pengc
 * @see com.platform.soa.inventory.dao
 * @since 2019/1/25
 */
@Repository
public interface InventoryDao extends CrudRepository<InventoryBean, String> {

    /**
     * 通过商品id，查询库存对象
     * @param productId 商品id
     * @return
     */
    InventoryBean findByProductId(String productId);


}
