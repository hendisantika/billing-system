package com.hendisantika.billingsystem.exception;

import com.hendisantika.billingsystem.common.Utils;
import com.hendisantika.billingsystem.messages.ErrorMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
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

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleCustomException(Exception ex, WebRequest request) throws Exception {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), Utils.currentDateTime());
        log.info("Clsss name " + ex.getClass().getName());
        log.info("type name " + ex.getClass().getTypeName());

        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(InvalidInputException.class)
    public final ResponseEntity<Object> invalidInputException(InvalidInputException ex, WebRequest request) throws Exception {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), Utils.currentDateTime());
        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public final ResponseEntity<Object> resourceNotFound(ResourceNotFoundException ex, WebRequest request) throws Exception {
        ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), Utils.currentDateTime());
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public final ResponseEntity<Object> dataIntegrity(DataIntegrityViolationException ex, WebRequest request) throws Exception {
        ErrorMessage errorMessage = new ErrorMessage("The generated code already exist", Utils.currentDateTime());
        System.out.println("Error message " + errorMessage.getErrorMessage());
        return new ResponseEntity<>(errorMessage, HttpStatus.CONFLICT);

    }
}
