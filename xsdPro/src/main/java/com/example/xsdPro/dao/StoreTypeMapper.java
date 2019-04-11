package com.example.xsdPro.dao;

import com.example.xsdPro.model.StoreType;
import com.example.xsdPro.model.StoreTypeKey;

public interface StoreTypeMapper {
    int deleteByPrimaryKey(StoreTypeKey key);

    int insert(StoreType record);

    int insertSelective(StoreType record);

    StoreType selectByPrimaryKey(StoreTypeKey key);

    int updateByPrimaryKeySelective(StoreType record);

    int updateByPrimaryKey(StoreType record);
}