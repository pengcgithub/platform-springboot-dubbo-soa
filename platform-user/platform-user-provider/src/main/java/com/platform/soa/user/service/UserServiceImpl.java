package com.platform.soa.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.platform.soa.user.api.UserService;
import com.platform.soa.user.dao.UserDao;
import com.platform.soa.user.domain.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

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

@Service(version = "${platform.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserBean findById(String id) {
        Optional<UserBean> userBeanOptional = userDao.findById(id);
        return userBeanOptional.isPresent() ? userBeanOptional.get() : null;
    }

    @Override
    public Boolean saveUser(UserBean userBean) {
        try {
            userDao.save(userBean);
        } catch (Exception e) {
            throw e;
        }
        return Boolean.TRUE;
    }

    @Override
    public List<UserBean> listUser() {
        return (List<UserBean>) userDao.findAll();
    }

}
