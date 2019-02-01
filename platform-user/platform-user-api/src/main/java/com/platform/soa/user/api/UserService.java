package com.platform.soa.user.api;

import com.platform.soa.user.domain.UserBean;
import org.dromara.hmily.annotation.Hmily;

import java.util.List;

/**
 * 用户业务逻辑<br/>
 *
 * @author pengc
 * @see com.platform.soa.user.api
 * @since 2018/12/27
 */
public interface UserService {

    UserBean findById(String id);

    @Hmily
    Boolean saveUser(UserBean userBean);

    List<UserBean> listUser();

}
