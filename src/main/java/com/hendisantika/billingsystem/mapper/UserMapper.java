package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.UserDTO;
import com.hendisantika.billingsystem.entity.User;
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
 * Time: 07.23
 */
@Mapper(implementationPackage = "mapper.impl")
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDTOtoUser(UserDTO userDto);

    @InheritInverseConfiguration
    UserDTO userToUserDTO(User user);

}
