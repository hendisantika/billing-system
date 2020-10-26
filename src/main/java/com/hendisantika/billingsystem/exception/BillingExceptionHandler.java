package com.hendisantika.billingsystem.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.41
 */
@Slf4j
@ControllerAdvice
@RestController
public class BillingExceptionHandler extends ResponseEntityExceptionHandler {

}
