package com.platform.soa.user.service;

import com.platform.soa.user.api.UserService;
import com.platform.soa.user.domain.UserBean;
import com.platform.soa.user.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.dromara.hmily.annotation.Hmily;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.util.List;

/**
 * <br/>
 *
 * @author pengc
 * @see com.platform.soa.user.service
 * @since 2019/1/3
 */
//@Service(
//        version = "${platform.service.version}",
//        application = "${dubbo.application.id}",
//        protocol = "${dubbo.protocol.id}",
//        registry = "${dubbo.registry.id}"
//)

@Slf4j
@Service(version = "${platform.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserBean findById(String id) {
        UserBean userBean = userMapper.selectByPrimaryKey(id);
        return userBean;
    }

    @Hmily(confirmMethod = "confirmUserBalance", cancelMethod = "cancelUserBalance")
    @Override
    public Boolean saveUser(UserBean userBean) {
        try {
            userMapper.insert(userBean);
        } catch (Exception e) {
            log.error("saveUser error:"+userBean.toString());
            throw e;
        }
        return Boolean.TRUE;
    }

    @Override
    public List<UserBean> listUser() {
        return userMapper.selectAll();
    }

    public void confirmUserBalance(UserBean userBean) {
        System.out.println("confirmUserBalance"+userBean.toString());
        userBean.setBalance(userBean.getBalance().subtract(userBean.getFreezeAmount()));
        userMapper.insert(userBean);
    }

    public void cancelUserBalance(UserBean userBean) {
        System.out.println("cancelUserBalance 打印日志："+userBean.toString());
        userBean.setBalance(userBean.getBalance().add(userBean.getFreezeAmount()));
        userBean.setFreezeAmount(BigDecimal.ZERO);
        userMapper.insert(userBean);
    }

}
