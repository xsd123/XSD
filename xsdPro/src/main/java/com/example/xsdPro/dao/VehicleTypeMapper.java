package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleType;
import com.example.xsdPro.model.VehicleTypeKey;

public interface VehicleTypeMapper {
    int deleteByPrimaryKey(VehicleTypeKey key);

    int insert(VehicleType record);

    int insertSelective(VehicleType record);

    VehicleType selectByPrimaryKey(VehicleTypeKey key);

    int updateByPrimaryKeySelective(VehicleType record);

    int updateByPrimaryKey(VehicleType record);
}