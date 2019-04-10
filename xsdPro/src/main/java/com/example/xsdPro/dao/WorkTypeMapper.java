package com.example.xsdPro.dao;

import com.example.xsdPro.model.WorkType;
import com.example.xsdPro.model.WorkTypeKey;

public interface WorkTypeMapper {
    int deleteByPrimaryKey(WorkTypeKey key);

    int insert(WorkType record);

    int insertSelective(WorkType record);

    WorkType selectByPrimaryKey(WorkTypeKey key);

    int updateByPrimaryKeySelective(WorkType record);

    int updateByPrimaryKey(WorkType record);
}