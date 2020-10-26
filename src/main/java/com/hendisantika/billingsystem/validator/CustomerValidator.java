package com.hendisantika.billingsystem.validator;

import com.hendisantika.billingsystem.common.UserType;
import com.hendisantika.billingsystem.dto.UserDTO;
import com.hendisantika.billingsystem.exception.InvalidInputException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.35
 */
@Service
public class CustomerValidator {

    private List<String> validationMessages;

    public void validate(UserDTO userDTO) {
        validationMessages = new ArrayList<>();
        if (userDTO != null && userDTO.getType().equalsIgnoreCase(UserType.CUSTOMER.name())) {
            if (StringUtils.isEmpty(userDTO.getMobileNo())) {
                validationMessages.add("Mobile No can't be empty");
            }
        }
        if (!validationMessages.isEmpty()) {
            throw new InvalidInputException(validationMessages);
        }
    }
}
