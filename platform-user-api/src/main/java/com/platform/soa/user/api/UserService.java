package com.platform.soa.user.api;

import com.platform.soa.user.domain.UserBean;
import java.util.List;

/**
 * <br/>
 *
 * @author pengc
 * @see com.platform.soa.user.api
 * @since 2018/12/27
 */
public interface UserService {

    UserBean findById(String id);

    Boolean saveUser(UserBean userBean);

    List<UserBean> listUser();

}
