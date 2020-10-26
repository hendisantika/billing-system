package com.hendisantika.billingsystem.exception;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.46
 */
public class DuplicateKeyFoundException extends Exception {
    public DuplicateKeyFoundException(String errorMessage) {
        super(errorMessage);
    }
}
