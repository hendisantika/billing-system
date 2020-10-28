package com.hendisantika.billingsystem.controller;

import com.hendisantika.billingsystem.dto.UserDTO;
import com.hendisantika.billingsystem.entity.User;
import com.hendisantika.billingsystem.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/10/20
 * Time: 05.05
 */

@Slf4j
@RestController
@RequestMapping("api/public/test")
public class TestController {
    @GetMapping("/log")
    public ResponseEntity<Void> logTest() {
        log.info("This is test log1");
        log.info("This is test log2");
        log.info("This is test log3");

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PostMapping("/mapper")
    public ResponseEntity<Void> mapperTesting(@RequestBody UserDTO userDto) {
        User user = UserMapper.INSTANCE.userDTOtoUser(userDto);
        log.debug("Entity Class......");
        log.info("Entity First Name " + user.getFirstName());
        log.info("Entity Last Name " + user.getLastName());
        UserDTO userDto2 = UserMapper.INSTANCE.userToUserDTO(user);
        log.debug("DTO Class......");
        log.info("DTO First Name " + userDto2.getFirstName());
        log.info("DTO Last Name " + userDto2.getLastName());
        log.error("This is error info......");
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
