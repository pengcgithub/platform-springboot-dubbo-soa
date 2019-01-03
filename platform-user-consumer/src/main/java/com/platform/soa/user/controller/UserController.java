package com.platform.soa.user.controller;

import io.swagger.annotations.ApiOperation;
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
@RestController
public class UserController {

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @GetMapping(value = "/user/findBy/{id}")
    public String findById(@PathVariable("id") String id) {
        return id;
    }

}
