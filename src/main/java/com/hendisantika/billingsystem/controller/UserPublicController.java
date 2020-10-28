package com.hendisantika.billingsystem.controller;

import com.hendisantika.billingsystem.service.RegistrationService;
import com.hendisantika.billingsystem.validator.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/10/20
 * Time: 05.06
 */
@RestController
@RequestMapping("api/public/users") // http://localhost:9091/api/public/users POST method
@Validated
public class UserPublicController {

    @Autowired
    CustomerValidator customerValidator;
    @Autowired
    private RegistrationService registrationService;
}
