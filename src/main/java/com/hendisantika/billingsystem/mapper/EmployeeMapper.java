package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.EmployeeDTO;
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
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDTO employeeToDTO(Employee employee);

    @InheritInverseConfiguration
    Employee dToToEmployee(EmployeeDTO employeeDto);

//    @AfterMapping
//    default void afterMapping(@MappingTarget Employee employee, EmployeeDto employeeDto) {
//        employeeDto.setId(employee.getId());
//        employeeDto.setFlowType(Constants.EMPLOYEE_FLOW_TYPE);
//    }
}
