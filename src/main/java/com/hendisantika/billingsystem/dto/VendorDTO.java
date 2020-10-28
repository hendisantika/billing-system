package com.hendisantika.billingsystem.dto;

import com.hendisantika.billingsystem.entity.User;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.24
 */
@Data
public class VendorDTO extends BaseDTO {

    private String fullName;

    private String vendorCode;

    private User user;
}
