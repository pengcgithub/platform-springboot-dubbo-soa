package com.platform.soa.order.domain;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "t_order")
@Data
public class OrderBean implements Serializable {

    @Id
    @GeneratedValue
    private String id;

    @Column(name = "number", length = 20)
    private String number;

    @Column(name = "status", length = 1)
    private String status;

    @Column(name = "product_id", length = 64)
    private String productId;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "count", length = 4)
    private Integer count;

    @Column(name = "userId", length = 64)
    private String userId;

    @Column(name = "create_time")
    private Date createTime;

}
