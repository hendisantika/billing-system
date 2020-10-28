package com.hendisantika.billingsystem.service;

import com.hendisantika.billingsystem.common.CodeGenerator;
import com.hendisantika.billingsystem.common.CodeType;
import com.hendisantika.billingsystem.common.UserType;
import com.hendisantika.billingsystem.common.Utils;
import com.hendisantika.billingsystem.dto.BaseDTO;
import com.hendisantika.billingsystem.dto.CustomerDTO;
import com.hendisantika.billingsystem.dto.EmployeeDTO;
import com.hendisantika.billingsystem.dto.UserDTO;
import com.hendisantika.billingsystem.dto.VendorDTO;
import com.hendisantika.billingsystem.entity.BaseObject;
import com.hendisantika.billingsystem.entity.Customer;
import com.hendisantika.billingsystem.entity.Employee;
import com.hendisantika.billingsystem.entity.Role;
import com.hendisantika.billingsystem.entity.User;
import com.hendisantika.billingsystem.entity.Vendor;
import com.hendisantika.billingsystem.exception.InvalidInputException;
import com.hendisantika.billingsystem.mapper.CustomerMapper;
import com.hendisantika.billingsystem.mapper.EmployeeMapper;
import com.hendisantika.billingsystem.mapper.UserMapper;
import com.hendisantika.billingsystem.mapper.VendorMapper;
import com.hendisantika.billingsystem.messages.ResponseMessage;
import com.hendisantika.billingsystem.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 28/10/20
 * Time: 07.19
 */
@Service
public class RegistrationService {

    @Autowired
    private BillingBaseService billingBaseService;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private CodeGenerator codeGenerator;

    @Value("${default.role}")
    private String defaultRole;

    public ResponseMessage<BaseDTO> doRegistration(UserDTO userDTO) throws Exception {

        ResponseMessage<BaseDTO> responseMessage = null;
        String type = userDTO.getType();
        try {
            UserType userType = UserType.valueOf(type.toUpperCase());
            User user = UserMapper.INSTANCE.userDTOtoUser(userDTO);
            Role role = roleRepository.findByName(defaultRole).orElse(null);
            List<Role> roleList = new ArrayList<>();
            roleList.add(role);
            user.setRoles(roleList);
            if (type.equalsIgnoreCase(UserType.EMPLOYEE.name())) {
                Employee employee = new Employee();
                employee.setFullName(Utils.getFullName(user.getFirstName(), user.getMiddleName(),
                        user.getLastName()));
                employee.setEmployeeCode(codeGenerator.newCode(CodeType.EMPLOYEE_CODE));
                employee.setUser(user);
                user.getAddressList().get(0).setUser(user);

                BaseObject newObject = billingBaseService.save(employee); // Holds the reference of Employee object
                EmployeeDTO employeeDto = EmployeeMapper.INSTANCE.employeeToDTO((Employee) newObject);
                responseMessage = ResponseMessage.withResponseData(employeeDto, "Employee Created Successfully",
                        "message");
            } else if (type.equalsIgnoreCase(UserType.CUSTOMER.name())) {
                Customer customer = new Customer();
                customer.setCustomerCode(codeGenerator.newCode(CodeType.CUSTOMER_CODE));
                customer.setFullName(Utils.getFullName(user.getFirstName(), user.getMiddleName(),
                        user.getLastName()));
                customer.setUser(user);
                user.getAddressList().get(0).setUser(user);
                BaseObject newObject = billingBaseService.save(customer);
                CustomerDTO customerDto = CustomerMapper.INSTANCE.customerToDTO((Customer) newObject);
                responseMessage = ResponseMessage.withResponseData(customerDto, "Customer Created Successfully",
                        "message");
            } else if (type.equalsIgnoreCase(UserType.VENDOR.name())) {
                Vendor vendor = new Vendor();
                vendor.setFullName(Utils.getFullName(user.getFirstName(),
                        user.getMiddleName(), user.getLastName()));
                vendor.setVendorCode(codeGenerator.newCode(CodeType.VENDOR_CODE));
                vendor.setUser(user);
                user.getAddressList().get(0).setUser(user);
                BaseObject newObject = billingBaseService.save(vendor);
                VendorDTO vendorDTO = VendorMapper.INSTANCE.vendorToVendorDTO((Vendor) newObject);
                responseMessage = ResponseMessage.withResponseData(vendorDTO, "Vendor Created Successfully", "message");
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidInputException(String.format("Invalid user type %s ", type));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return responseMessage;
    }

}
