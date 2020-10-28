package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.VendorDTO;
import com.hendisantika.billingsystem.entity.Vendor;
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
 * Time: 07.24
 */
@Mapper(implementationPackage = "mapper.impl")
public interface VendorMapper {
    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    Vendor vendorDTOtoUser(VendorDTO vendorDTO);

    @InheritInverseConfiguration
    VendorDTO vendorToVendorDTO(Vendor vendor);

}
