package com.hendisantika.billingsystem.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.16
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ValidationMessage {
    private String validationMessage;
    private HttpStatus httpStatus;
    private LocalDateTime localDateTime;
}
