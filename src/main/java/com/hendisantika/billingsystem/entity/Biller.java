package com.hendisantika.billingsystem.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/10/20
 * Time: 08.24
 */
@Data
@Entity
@Table(name = "biller")
public class Biller extends BaseObject {

    @Column(name = "bill_no", nullable = false)
    private String billNo;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private List<Product> products;

}
