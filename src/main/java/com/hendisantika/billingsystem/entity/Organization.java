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
 * Time: 08.27
 */
@Data
@Entity
@Table(name = "organization")
public class Organization extends BaseObject {

    @Column(name = "org_code", nullable = false)
    private String orgCode;

    @Column(name = "org_name", nullable = false)
    private String orgName;
}
