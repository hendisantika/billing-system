package com.hendisantika.billingsystem.validator;

import com.hendisantika.billingsystem.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Validator;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.16
 */
@Slf4j
@Service
public class EmptyORNullCheckValidator implements ConstraintValidator<EmptyOrNullCheck, UserDTO> {

    @Autowired
    Validator validator;

    @Override
    public void initialize(EmptyOrNullCheck constraintAnnotation) {

    }

    @Override
    public boolean isValid(UserDTO userDTO, ConstraintValidatorContext constraintValidatorContext) {
        boolean isValid = true;
        if (StringUtils.isEmpty(userDTO.getMobileNo())) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext
                    .buildConstraintViolationWithTemplate("Enter valid mobile no.")
                    .addConstraintViolation();
            // return false if validation fails
            isValid = false;
        }
        return isValid;
    }
}
