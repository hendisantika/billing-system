package com.hendisantika.billingsystem.mapper;

import com.hendisantika.billingsystem.dto.VendorDTO;
import com.hendisantika.billingsystem.entity.Vendor;

import javax.annotation.Generated;


/**
 * Created by IntelliJ IDEA.
 * Project : billing-system
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/10/20
 * Time: 05.03
 */
@Generated(
        value = "org.mapstruct.ap.MappingProcessor",
        date = "2020-10-18T15:59:59+0530",
        comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class VendorMapperImpl implements VendorMapper {
    @Override
    public Vendor vendorDTOtoUser(VendorDTO vendorDTO) {
        if (vendorDTO == null) {
            return null;
        }

        Vendor vendor = new Vendor();

        vendor.setId(vendorDTO.getId());
        vendor.setFlowType(vendorDTO.getType());
        vendor.setFullName(vendorDTO.getFullName());
        vendor.setVendorCode(vendorDTO.getVendorCode());
        vendor.setUser(vendorDTO.getUser());

        return vendor;
    }

    @Override
    public VendorDTO vendorToVendorDTO(Vendor vendor) {
        if (vendor == null) {
            return null;
        }

        VendorDTO vendorDTO = new VendorDTO();

        vendorDTO.setId(vendor.getId());
        vendorDTO.setType(vendor.getFlowType());
        vendorDTO.setFullName(vendor.getFullName());
        vendorDTO.setVendorCode(vendor.getVendorCode());
        vendorDTO.setUser(vendor.getUser());

        return vendorDTO;
    }
}
