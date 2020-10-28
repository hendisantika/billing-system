package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.CustomerDTO;
import com.hendisantika.billingsystem.entity.Customer;
import com.hendisantika.billingsystem.entity.Employee;

import javax.annotation.processing.Generated;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.26
 */
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2020-10-18T15:59:59+0530",
        comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public CustomerDTO customerToDTO(Customer customer) {
        if (customer == null) {
            return null;
        }

        CustomerDTO customerDTO = new CustomerDTO();

        customerDTO.setId(customer.getId());
        customerDTO.setType(customer.getFlowType());
        customerDTO.setFullName(customer.getFullName());
        customerDTO.setCustomerCode(customer.getCustomerCode());
        customerDTO.setUser(customer.getUser());

        return customerDTO;
    }

    @Override
    public Employee dTOToCustomer(CustomerDTO customerVO) {
        if (customerVO == null) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId(customerVO.getId());
        employee.setFlowType(customerVO.getType());
        employee.setFullName(customerVO.getFullName());
        employee.setUser(customerVO.getUser());

        return employee;
    }
}
