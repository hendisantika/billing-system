package com.hendisantika.billingsystem.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/10/20
 * Time: 08.19
 */
@Data
@Entity
@Table(name = "tax")
public class Tax extends BaseObject {

    @Column(name = "hsn_code", nullable = false)
    private String hsnCode;

    @Column(name = "tax_percentage", nullable = false)
    private String taxPercentage;

    @Column(name = "tax_description", nullable = false)
    private String taxDescription;
}
