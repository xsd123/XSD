package com.example.xsdPro.dao;

import com.example.xsdPro.model.PartProperties;
import com.example.xsdPro.model.PartPropertiesKey;

public interface PartPropertiesMapper {
    int deleteByPrimaryKey(PartPropertiesKey key);

    int insert(PartProperties record);

    int insertSelective(PartProperties record);

    PartProperties selectByPrimaryKey(PartPropertiesKey key);

    int updateByPrimaryKeySelective(PartProperties record);

    int updateByPrimaryKey(PartProperties record);
}