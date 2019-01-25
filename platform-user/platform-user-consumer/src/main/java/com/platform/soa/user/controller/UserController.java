package com.platform.soa.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.platform.soa.inventory.api.InventoryService;
import com.platform.soa.inventory.domain.InventoryBean;
import com.platform.soa.user.api.UserService;
import com.platform.soa.user.domain.UserBean;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br/>
 *
 * @author pengc
 * @see com.platform.soa.user.controller
 * @since 2019/1/3
 */
@Slf4j
@RestController
public class UserController {

//    @Reference(version = "${platform.service.version}",
//            application = "${dubbo.application.id}",
//            registry = "${dubbo.registry.id}")

    @Reference(version = "${platform.service.version}")
    private UserService userService;

    @Reference(version = "${platform.service.version}")
    private InventoryService inventoryService;

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @GetMapping(value = "/user/findBy/{id}")
    public UserBean findById(@PathVariable("id") String id) {
        return userService.findById(id);
    }

    @ApiOperation(value="通过商品id获取商品库存信息", notes="根据productId获取商品库存信息")
    @GetMapping(value = "/user/queryInventoryBy/{productId}")
    public InventoryBean queryInventoryByProductId(@PathVariable("productId") String productId) {
        try {
            return inventoryService.selectInventoryByProductId(productId);
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }

}
