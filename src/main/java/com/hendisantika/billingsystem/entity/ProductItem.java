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
 * Time: 08.28
 */
@Data
@Entity
@Table(name = "product_item")
public class ProductItem extends BaseObject {

    @Column(name = "code", nullable = false)
    private String code;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;
}
