package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleTypeInColor;
import com.example.xsdPro.model.VehicleTypeInColorKey;

public interface VehicleTypeInColorMapper {
    int deleteByPrimaryKey(VehicleTypeInColorKey key);

    int insert(VehicleTypeInColor record);

    int insertSelective(VehicleTypeInColor record);

    VehicleTypeInColor selectByPrimaryKey(VehicleTypeInColorKey key);

    int updateByPrimaryKeySelective(VehicleTypeInColor record);

    int updateByPrimaryKey(VehicleTypeInColor record);
}