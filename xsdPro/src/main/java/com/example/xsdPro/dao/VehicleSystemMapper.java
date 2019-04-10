package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleSystem;
import com.example.xsdPro.model.VehicleSystemKey;

public interface VehicleSystemMapper {
    int deleteByPrimaryKey(VehicleSystemKey key);

    int insert(VehicleSystem record);

    int insertSelective(VehicleSystem record);

    VehicleSystem selectByPrimaryKey(VehicleSystemKey key);

    int updateByPrimaryKeySelective(VehicleSystem record);

    int updateByPrimaryKey(VehicleSystem record);
}