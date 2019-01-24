package com.platform.soa.inventory.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 库存<br/>
 *
 * @author pengc
 * @see com.platform.soa.inventory.domain
 * @since 2019/1/24
 */
@Entity
@Table(name = "t_inventory")
@Data
public class InventoryBean implements Serializable {

    @Id
    @GeneratedValue
    private String id;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "total_inventory")
    private Integer totalInventory;

    @Column(name = "lock_inventory")
    private Integer lockInventory;

}
