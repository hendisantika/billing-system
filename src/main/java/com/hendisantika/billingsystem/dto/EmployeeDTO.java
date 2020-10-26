package com.hendisantika.billingsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.39
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDTO extends BaseDTO {

    private String fullName;

    private String employeeCode;

    private UserDTO user;
}
