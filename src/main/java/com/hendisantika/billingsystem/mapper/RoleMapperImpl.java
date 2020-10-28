package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.RoleDTO;
import com.hendisantika.billingsystem.entity.Role;

import javax.annotation.processing.Generated;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/10/20
 * Time: 04.56
 */
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2020-10-19T15:17:09+0530",
        comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class RoleMapperImpl implements RoleMapper {
    @Override
    public Role roleDTOtoRole(RoleDTO roleDTO) {
        if (roleDTO == null) {
            return null;
        }

        Role role = new Role();

        role.setId(roleDTO.getId());
        role.setFlowType(roleDTO.getType());
        role.setName(roleDTO.getName());
        role.setDescription(roleDTO.getDescription());

        return role;
    }

}
