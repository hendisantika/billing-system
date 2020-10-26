package com.hendisantika.billingsystem.exception;

import java.util.List;

/**
 * Created by IntelliJ IDEA. Project : billing-system User: hendisantika Email:
 * hendisantika@gmail.com Telegram : @hendisantika34 Date: 27/10/20 Time: 05.40
 */
public class InvalidInputException extends RuntimeException {

    private List<String> errorList;

    public InvalidInputException(String message) {
        super(message);
    }

    public InvalidInputException(List<String> errorList) {
        this.errorList = errorList;
    }

    public List<String> getErrorList() {
        return errorList;
    }
}
