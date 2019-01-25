package com.platform.soa.inventory.api;

import com.platform.soa.inventory.domain.InventoryBean;

/**
 * 库存业务逻辑接口<br/>
 *
 * @author pengc
 * @see com.platform.soa.inventory.api
 * @since 2019/1/24
 */
public interface InventoryService {

    /**
     * 更新库存数据
     * @param inventoryBean
     * @return
     */
    Boolean updateInventoryInfo(InventoryBean inventoryBean) throws Exception;

    InventoryBean selectInventoryByProductId(String productId) throws Exception;

}
