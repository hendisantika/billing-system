package com.hendisantika.billingsystem.dto;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.36
 */

import lombok.Data;

import java.io.Serializable;

@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseDTO implements Serializable {
    protected Long id;
    protected String type;
}
