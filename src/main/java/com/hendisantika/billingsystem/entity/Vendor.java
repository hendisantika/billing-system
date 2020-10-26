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
 * Time: 08.21
 */
@Data
@Entity
@Table(name = "vendor")
public class Vendor extends BaseObject {

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "vendor_code", nullable = false)
    private String vendorCode;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
}
