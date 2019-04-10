package com.example.xsdPro.dao;

import com.example.xsdPro.model.StoreHouse;
import com.example.xsdPro.model.StoreHouseKey;

public interface StoreHouseMapper {
    int deleteByPrimaryKey(StoreHouseKey key);

    int insert(StoreHouse record);

    int insertSelective(StoreHouse record);

    StoreHouse selectByPrimaryKey(StoreHouseKey key);

    int updateByPrimaryKeySelective(StoreHouse record);

    int updateByPrimaryKey(StoreHouse record);
}