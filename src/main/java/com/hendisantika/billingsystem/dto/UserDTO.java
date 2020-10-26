package com.hendisantika.billingsystem.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.37
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDTO extends BaseDTO {


    @NotBlank(message = "Email Address can't be empty")
    private String emailId;

    @NotBlank(message = "First Name can't be empty")
    private String firstName;

    private String middleName;

    @NotBlank(message = "Last Name can't be empty")
    private String lastName;

    @NotBlank(message = "Mobile No Name can't be empty")
    private String mobileNo;

    private List<AddressDTO> addressList;

    private List<RoleDTO> roles;

    private EmployeeDTO employee;

}
