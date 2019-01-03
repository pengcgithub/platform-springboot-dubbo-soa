package com.platform.soa.user.dao;

import com.platform.soa.user.domain.UserBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * <br/>
 *
 * @author pengc
 * @see com.platform.soa.user.dao
 * @since 2019/1/3
 */
@Repository
public interface UserDao extends JpaRepository<UserBean, String> {
}
