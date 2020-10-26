package com.hendisantika.billingsystem.repository;

import com.hendisantika.billingsystem.entity.BaseObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/10/20
 * Time: 08.32
 */
public interface AbstractBaseRepository<T extends BaseObject, ID extends Serializable>
        extends JpaRepository<T, ID> {
}
