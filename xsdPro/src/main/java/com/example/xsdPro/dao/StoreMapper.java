package com.example.xsdPro.dao;

import com.example.xsdPro.model.Store;
import com.example.xsdPro.model.StoreKey;

public interface StoreMapper {
    int deleteByPrimaryKey(StoreKey key);

    int insert(Store record);

    int insertSelective(Store record);

    Store selectByPrimaryKey(StoreKey key);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
}