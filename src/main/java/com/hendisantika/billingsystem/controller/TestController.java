package com.hendisantika.billingsystem.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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

}
