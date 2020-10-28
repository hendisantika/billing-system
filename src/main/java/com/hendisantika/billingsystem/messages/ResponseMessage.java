package com.hendisantika.billingsystem.messages;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.15
 */
@Data
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
//@RequiredArgsConstructor(access = AccessLevel.PUBLIC)
public class ResponseMessage<T> {

    private T responseClassType; // EmployeeDTO, customerDTO,VendorDTO , StockDTO or OrderDTO

    private String message;

    private String messageType;

    public static <T> ResponseMessage<T> withResponseData(T classType, String message, String messageType) {
        return new ResponseMessage<T>(classType, message, messageType);
    }

//    public static <T> ResponseMessage<T> withResponseData(T classType) {
//        return new ResponseMessage<T>(classType);
//    }

    public static ResponseMessage<Void> empty() {
        return new ResponseMessage<>();
    }
}
