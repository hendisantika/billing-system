package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.UserDTO;
import com.hendisantika.billingsystem.entity.User;

import javax.annotation.processing.Generated;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/10/20
 * Time: 04.57
 */
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2020-10-16T17:21:00+0530",
        comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {
    @Override
    public User userDTOtoUser(UserDTO userDto) {
        if (userDto == null) {
            return null;
        }

        User user = new User();

        user.setEmailId(userDto.getEmailId());
        user.setFirstName(userDto.getFirstName());
        user.setMiddleName(userDto.getMiddleName());
        user.setLastName(userDto.getLastName());
        user.setMobileNo(userDto.getMobileNo());
        user.setAddressList(addressDtoListToAddressList(userDto.getAddressList()));
        user.setRoles(roleDtoListToRoleList(userDto.getRoles()));

        return user;
    }

    @Override
    public UserDTO userToUserDTO(User user) {
        if (user == null) {
            return null;
        }

        UserDTO userDto = new UserDTO();

        userDto.setEmailId(user.getEmailId());
        userDto.setFirstName(user.getFirstName());
        userDto.setMiddleName(user.getMiddleName());
        userDto.setLastName(user.getLastName());
        userDto.setMobileNo(user.getMobileNo());
        userDto.setAddressList(addressListToAddressDtoList(user.getAddressList()));
        userDto.setRoles(roleListToRoleDtoList(user.getRoles()));

        return userDto;
    }
}
