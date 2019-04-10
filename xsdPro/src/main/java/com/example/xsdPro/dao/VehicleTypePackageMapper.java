package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleTypePackage;
import com.example.xsdPro.model.VehicleTypePackageKey;

public interface VehicleTypePackageMapper {
    int deleteByPrimaryKey(VehicleTypePackageKey key);

    int insert(VehicleTypePackage record);

    int insertSelective(VehicleTypePackage record);

    VehicleTypePackage selectByPrimaryKey(VehicleTypePackageKey key);

    int updateByPrimaryKeySelective(VehicleTypePackage record);

    int updateByPrimaryKey(VehicleTypePackage record);
}