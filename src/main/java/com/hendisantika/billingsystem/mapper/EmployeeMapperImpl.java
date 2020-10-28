package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.AddressDTO;
import com.hendisantika.billingsystem.dto.EmployeeDTO;
import com.hendisantika.billingsystem.dto.RoleDTO;
import com.hendisantika.billingsystem.entity.Address;
import com.hendisantika.billingsystem.entity.Employee;
import com.hendisantika.billingsystem.entity.Role;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.28
 */
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2020-10-17T05:50:19+0530",
        comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {
    @Override
    public EmployeeDTO employeeToDTO(Employee employee) {
        if (employee == null) {
            return null;
        }

        EmployeeDTO employeeDto = new EmployeeDTO();

        employeeDto.setId(employee.getId());
        employeeDto.setType(employee.getFlowType());
        employeeDto.setFullName(employee.getFullName());
        employeeDto.setEmployeeCode(employee.getEmployeeCode());
        employeeDto.setUser(userToUserDto(employee.getUser()));

        return employeeDto;
    }

    @Override
    public Employee dToToEmployee(EmployeeDTO employeeDto) {
        if (employeeDto == null) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId(employeeDto.getId());
        employee.setFlowType(employeeDto.getType());
        employee.setFullName(employeeDto.getFullName());
        employee.setEmployeeCode(employeeDto.getEmployeeCode());
        employee.setUser(userDtoToUser(employeeDto.getUser()));

//        afterMapping( employee, employeeDto );

        return employee;
    }

    protected AddressDTO addressToAddressDto(Address address) {
        if (address == null) {
            return null;
        }

        AddressDTO addressDto = new AddressDTO();

        addressDto.setId(address.getId());
        addressDto.setType(address.getFlowType());
        addressDto.setAddress1(address.getAddress1());
        addressDto.setAddress2(address.getAddress2());
        addressDto.setCity(address.getCity());
        addressDto.setState(address.getState());
        addressDto.setCountry(address.getCountry());
        addressDto.setLandmark(address.getLandmark());
        addressDto.setMobile(address.getMobile());

        return addressDto;
    }

    protected List<AddressDTO> addressListToAddressDtoList(List<Address> list) {
        if (list == null) {
            return null;
        }

        List<AddressDTO> list1 = new ArrayList<AddressDTO>(list.size());
        for (Address address : list) {
            list1.add(addressToAddressDto(address));
        }

        return list1;
    }

    protected RoleDTO roleToRoleDto(Role role) {
        if (role == null) {
            return null;
        }

        RoleDTO roleDto = new RoleDTO();

        roleDto.setId(role.getId());
        roleDto.setType(role.getFlowType());
        roleDto.setName(role.getName());
        roleDto.setDescription(role.getDescription());

        return roleDto;
    }
}
