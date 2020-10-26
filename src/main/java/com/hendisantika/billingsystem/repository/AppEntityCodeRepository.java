package com.hendisantika.billingsystem.repository;

import com.hendisantika.billingsystem.entity.AppEntityCode;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/10/20
 * Time: 08.17
 */
public interface AppEntityCodeRepository extends JpaRepository<AppEntityCode, Long> {
    AppEntityCode findByCode(String code);
}
