package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.CustomerDTO;
import com.hendisantika.billingsystem.entity.Customer;
import com.hendisantika.billingsystem.entity.Employee;
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
 * Time: 07.22
 */
@Mapper(implementationPackage = "mapper.impl")
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerToDTO(Customer customer);

    @InheritInverseConfiguration
    Employee dTOToCustomer(CustomerDTO customerVO);
}
