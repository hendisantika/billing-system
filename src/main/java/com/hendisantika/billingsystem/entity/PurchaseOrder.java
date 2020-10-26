package com.hendisantika.billingsystem.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/10/20
 * Time: 08.29
 */
@Data
@Entity
@Table(name = "purchase_order")
public class PurchaseOrder extends BaseObject {

    @Column(name = "product_code", nullable = false)
    private long productCode;

    @Column(name = "productDescription", nullable = false)
    private String productDescription;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "price", nullable = false)
    private double price;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "vendor_id")
    private Vendor vendor;
}
