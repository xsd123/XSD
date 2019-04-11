package com.example.xsdPro.dao;

import com.example.xsdPro.model.PersonTarget;
import com.example.xsdPro.model.PersonTargetKey;

public interface PersonTargetMapper {
    int deleteByPrimaryKey(PersonTargetKey key);

    int insert(PersonTarget record);

    int insertSelective(PersonTarget record);

    PersonTarget selectByPrimaryKey(PersonTargetKey key);

    int updateByPrimaryKeySelective(PersonTarget record);

    int updateByPrimaryKey(PersonTarget record);
}