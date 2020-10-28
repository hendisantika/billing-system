package com.hendisantika.billingsystem.controller;

import com.hendisantika.billingsystem.common.UserType;
import com.hendisantika.billingsystem.dto.UserDTO;
import com.hendisantika.billingsystem.messages.ResponseMessage;
import com.hendisantika.billingsystem.service.RegistrationService;
import com.hendisantika.billingsystem.validator.CustomerValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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

    @PostMapping("/employees") // http://localhost:9090/api/public/users/employees
    public ResponseEntity<ResponseMessage<?>> updateEmployee(@Valid @RequestBody UserDTO requestBody) throws Exception {
        requestBody.setType(UserType.EMPLOYEE.name());
        ResponseMessage responseMessage = registrationService.doRegistration(requestBody);
        return new ResponseEntity<ResponseMessage<?>>(responseMessage, HttpStatus.CREATED);
    }
}
