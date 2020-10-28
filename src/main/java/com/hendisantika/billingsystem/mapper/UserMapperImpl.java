package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.AddressDTO;
import com.hendisantika.billingsystem.dto.UserDTO;
import com.hendisantika.billingsystem.entity.Address;
import com.hendisantika.billingsystem.entity.User;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

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

    protected Address addressDtoToAddress(AddressDTO addressDto) {
        if (addressDto == null) {
            return null;
        }

        Address address = new Address();

        address.setAddress1(addressDto.getAddress1());
        address.setAddress2(addressDto.getAddress2());
        address.setCity(addressDto.getCity());
        address.setState(addressDto.getState());
        address.setCountry(addressDto.getCountry());
        address.setLandmark(addressDto.getLandmark());
        address.setMobile(addressDto.getMobile());

        return address;
    }

    protected List<Address> addressDtoListToAddressList(List<AddressDTO> list) {
        if (list == null) {
            return null;
        }

        List<Address> list1 = new ArrayList<Address>(list.size());
        for (AddressDTO addressDto : list) {
            list1.add(addressDtoToAddress(addressDto));
        }

        return list1;
    }
}
