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
 * Time: 08.21
 */
@Data
@Entity
@Table(name = "offer")
public class Offer extends BaseObject {

    @Column(name = "offer_code", nullable = false)
    private String offerCode;

    @Column(name = "offer_type", nullable = false)
    private String offerType;

    @Column(name = "offer_name", nullable = false)
    private String offerName;
}
