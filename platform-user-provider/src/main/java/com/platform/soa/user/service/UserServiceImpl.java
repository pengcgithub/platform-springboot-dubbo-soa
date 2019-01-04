package com.platform.soa.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.platform.soa.user.api.UserService;
import com.platform.soa.user.dao.UserDao;
import com.platform.soa.user.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <br/>
 *
 * @author pengc
 * @see com.platform.soa.user.service
 * @since 2019/1/3
 */
@Service(
        version = "${platform.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserBean findById(String id) {
        return userDao.findById(id).get();
//        UserBean userBean = new UserBean();
//        userBean.setUserName("pengc");
//        userBean.setUserPhone("18262632337");
//        return userBean;
    }

}
