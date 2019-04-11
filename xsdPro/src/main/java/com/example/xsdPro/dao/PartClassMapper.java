package com.example.xsdPro.dao;

import com.example.xsdPro.model.PartClass;
import com.example.xsdPro.model.PartClassKey;

public interface PartClassMapper {
    int deleteByPrimaryKey(PartClassKey key);

    int insert(PartClass record);

    int insertSelective(PartClass record);

    PartClass selectByPrimaryKey(PartClassKey key);

    int updateByPrimaryKeySelective(PartClass record);

    int updateByPrimaryKey(PartClass record);
}