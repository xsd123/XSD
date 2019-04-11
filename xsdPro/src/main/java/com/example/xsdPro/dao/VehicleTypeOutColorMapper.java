package com.example.xsdPro.dao;

import com.example.xsdPro.model.VehicleTypeOutColor;
import com.example.xsdPro.model.VehicleTypeOutColorKey;

public interface VehicleTypeOutColorMapper {
    int deleteByPrimaryKey(VehicleTypeOutColorKey key);

    int insert(VehicleTypeOutColor record);

    int insertSelective(VehicleTypeOutColor record);

    VehicleTypeOutColor selectByPrimaryKey(VehicleTypeOutColorKey key);

    int updateByPrimaryKeySelective(VehicleTypeOutColor record);

    int updateByPrimaryKey(VehicleTypeOutColor record);
}