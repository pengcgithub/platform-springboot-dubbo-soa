package com.platform.soa.user.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户实体<br/>
 *
 * @author pengc
 * @see com.platform.soa.user.domain
 * @since 2018/12/27
 */
@Data
@Table(name = "t_user")
public class UserBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(length = 25, name = "user_name")
    private String userName;

    @Column(length = 11, name = "user_phone")
    private String userPhone;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "modify_time")
    private Date modifyTime;

    @Column(name = "balance")
    private BigDecimal balance;

    @Column(name = "freeze_amount")
    private BigDecimal freezeAmount;

}
