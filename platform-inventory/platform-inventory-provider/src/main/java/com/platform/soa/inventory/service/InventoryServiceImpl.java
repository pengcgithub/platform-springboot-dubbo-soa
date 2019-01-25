package com.platform.soa.inventory.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.platform.soa.inventory.api.InventoryService;
import com.platform.soa.inventory.dao.InventoryDao;
import com.platform.soa.inventory.domain.InventoryBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 库存业务逻辑<br/>
 *
 * @author pengc
 * @see com.platform.soa.inventory.service
 * @since 2019/1/25
 */
@Slf4j
@Service(version = "${platform.service.version}")
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryDao inventoryDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Boolean updateInventoryInfo(InventoryBean inventoryBean) throws Exception {
        checkUpdateInventoryInfo(inventoryBean);
        try {
            String productId = inventoryBean.getProductId();
            InventoryBean existInventory = inventoryDao.findByProductId(productId);
            existInventory.setTotalInventory(existInventory.getTotalInventory() - inventoryBean.getDeductionInventory());
            existInventory.setLockInventory(inventoryBean.getDeductionInventory());
            inventoryDao.save(existInventory);
            return Boolean.TRUE;
        } catch (Exception e) {
            log.error("update inventory info:{}", e.getMessage());
            throw e;
        }
    }

    @Override
    public InventoryBean selectInventoryByProductId(String productId) throws Exception {
        try {
            InventoryBean inventoryBean = inventoryDao.findByProductId(productId);
            return inventoryBean;
        } catch (Exception e) {
            log.error("selectInventoryByProductId error:{}", e.getMessage());
            throw e;
        }
    }

    private void checkUpdateInventoryInfo(InventoryBean inventoryBean) throws Exception {
        if(null == inventoryBean) {
            throw new Exception("inventoryBean is not null");
        } else {
            String productId = inventoryBean.getProductId();
            Integer deductionInventory = inventoryBean.getDeductionInventory();
            if (StringUtils.isBlank(productId) && null == deductionInventory) {
                throw new Exception("save  param is not null");
            }
        }
    }

}
