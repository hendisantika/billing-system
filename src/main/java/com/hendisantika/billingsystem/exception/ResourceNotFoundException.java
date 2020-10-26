package com.hendisantika.billingsystem.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.45
 */
public class ResourceNotFoundException extends Exception {

    public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
