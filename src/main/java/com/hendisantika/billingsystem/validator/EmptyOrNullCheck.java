package com.hendisantika.billingsystem.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.17
 */
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = EmptyORNullCheckValidator.class)
@Documented
public @interface EmptyOrNullCheck {

    String message() default "Mobile No can't be empty";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
