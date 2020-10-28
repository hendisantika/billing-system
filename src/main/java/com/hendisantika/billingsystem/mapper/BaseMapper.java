package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.BaseDTO;
import com.hendisantika.billingsystem.entity.BaseObject;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.21
 */
@Mapper(implementationPackage = "mapper.impl")
public interface BaseMapper {
    BaseMapper INSTANCE = Mappers.getMapper(BaseMapper.class);

    BaseDTO baseObjectToDto(BaseObject baseObject);

    @InheritInverseConfiguration
    BaseObject dToToEmployee(BaseDTO baseDto);
}
