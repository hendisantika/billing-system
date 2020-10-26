package com.hendisantika.billingsystem.entity;

import com.hendisantika.billingsystem.common.CodeType;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/10/20
 * Time: 04.58
 */
@Data
@Entity
@Table(name = "app_entity_code")
public class AppEntityCode extends BaseObject {

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "code_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private CodeType codeType;
}
