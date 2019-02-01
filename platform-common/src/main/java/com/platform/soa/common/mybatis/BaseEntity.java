package com.platform.soa.common.mybatis;

import lombok.Data;
import javax.persistence.*;

/**
 * 基础entity<br/>
 *
 * @author pengc
 * @see com.platform.soa.common.mybatis
 * @since 2019/2/1
 */
@Data
public class BaseEntity {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

}
