package com.hendisantika.billingsystem.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;

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
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException arguments,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        BindingResult bindingResult = arguments.getBindingResult();
        List<String> validationMessages = new ArrayList<>();
        List<ObjectError> objectErrors = bindingResult.getAllErrors();
        for (ObjectError objectError : objectErrors) {
            String defaultMessage = objectError.getDefaultMessage();
            validationMessages.add(defaultMessage);
        }
        return new ResponseEntity<>(validationMessages, HttpStatus.BAD_REQUEST);
    }

    //    private List<String> employeeValidation(BindingResult bindingResult) {
//       List<String> validationMessages = new ArrayList<>();
//        List<ObjectError> objectErrors = bindingResult.getAllErrors();
//        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
//        String typeValue = String.valueOf(bindingResult.getRawFieldValue("type"));
//
//        if (UserType.CUSTOMER.name().equalsIgnoreCase(typeValue)) {
//            FieldError fieldError = bindingResult.getFieldError("mobileNo");
//            if(fieldError != null) {
//                String message = String.valueOf(fieldError.getDefaultMessage());
//                validationMessages.add(message);
//            }
//        }else{
//            addErrorMessages(fieldErrors);
//        }
//
//        return validationMessages;
//    }
    private List<String> addErrorMessages(List<FieldError> fieldErrors) {
        List<String> validationMessages = new ArrayList<>();
        for (FieldError fieldError : fieldErrors) {
            log.info("#### field Name  " + fieldError.getField());
            log.info("#### Rejected Value Name  " + fieldError.getRejectedValue());
            log.info("Default Message in field error " + fieldError.getDefaultMessage());
            validationMessages.add(fieldError.getDefaultMessage());
        }
        return validationMessages;
    }
}
