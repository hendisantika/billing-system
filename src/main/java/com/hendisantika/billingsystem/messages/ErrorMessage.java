package com.hendisantika.billingsystem.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/10/20
 * Time: 05.43
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {
    private String errorMessage;
    private LocalDateTime localDateTime;
}
