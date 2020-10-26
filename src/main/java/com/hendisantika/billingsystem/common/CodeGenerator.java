package com.hendisantika.billingsystem.common;

import com.hendisantika.billingsystem.entity.AppEntityCode;
import com.hendisantika.billingsystem.repository.AppEntityCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 26/10/20
 * Time: 08.16
 */
@Component
public class CodeGenerator {

    @Autowired
    private AppEntityCodeRepository appEntityCodeRepository;

    public String newCode(CodeType codeType) {
        String code = "";
        AppEntityCode appEntityCode = null;
        do {
            String newCode = getCode();
            appEntityCode = appEntityCodeRepository.findByCode(newCode);
            if (appEntityCode == null) {
                code = newCode;
            }
        } while (appEntityCode != null);
        appEntityCode = new AppEntityCode();
        appEntityCode.setCode(code);
        appEntityCode.setCodeType(codeType);
        appEntityCodeRepository.save(appEntityCode);
        return appEntityCode.getCode();
    }

    private String getCode() {
        Random r = new Random(System.currentTimeMillis());
        int id = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
        return String.valueOf(id);
    }
}
