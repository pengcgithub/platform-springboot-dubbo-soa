package com.platform.soa.user.domain;

import lombok.Data;
import java.util.Date;

/**
 * <br/>
 *
 * @author pengc
 * @see com.platform.soa.user.domain
 * @since 2018/12/27
 */
@Data
public class UserBean {

    private String id;

    private String userName;

    private long userPhone;

    private Date createTime;

    private Date modifyTime;

    private int score;

}
