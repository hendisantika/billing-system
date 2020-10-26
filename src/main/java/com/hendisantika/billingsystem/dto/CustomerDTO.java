package com.hendisantika.billingsystem.dto;

import com.hendisantika.billingsystem.entity.User;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.40
 */
@Data
public class CustomerDTO extends BaseDTO {

    private String fullName;

    private String customerCode;

    private User user;
}
