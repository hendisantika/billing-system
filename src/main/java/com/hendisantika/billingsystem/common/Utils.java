package com.hendisantika.billingsystem.common;

import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/10/20
 * Time: 04.59
 */
public class Utils {

    public static String getFullName(String firstName, String middleName, String lastName) {

        String fullName = null;
        if (StringUtils.isEmpty(firstName) || StringUtils.isEmpty(middleName) || StringUtils.isEmpty(lastName)) {
            return fullName;
        }
        if (StringUtils.isEmpty(middleName)) {
            fullName = new StringBuilder().append(firstName)
                    .append(" ").append(lastName).toString();
        } else {
            fullName = new StringBuilder().append(firstName).append(" ")
                    .append(middleName).append(" ").append(lastName).toString();
        }
        return fullName;
    }

    public static LocalDateTime currentDateTime() {
        return LocalDateTime.now();
    }
}
