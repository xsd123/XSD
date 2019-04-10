package com.example.xsdPro.dao;

import com.example.xsdPro.model.PartType;
import com.example.xsdPro.model.PartTypeKey;

public interface PartTypeMapper {
    int deleteByPrimaryKey(PartTypeKey key);

    int insert(PartType record);

    int insertSelective(PartType record);

    PartType selectByPrimaryKey(PartTypeKey key);

    int updateByPrimaryKeySelective(PartType record);

    int updateByPrimaryKey(PartType record);
}