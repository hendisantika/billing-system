package com.hendisantika.billingsystem.entity;

import javax.persistence.Column;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/10/20
 * Time: 08.26
 */
public class EntityCode extends BaseObject {
    @Column(name = "code", unique = true, nullable = false)
    String code;
}
