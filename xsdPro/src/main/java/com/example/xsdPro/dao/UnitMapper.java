package com.example.xsdPro.dao;

import com.example.xsdPro.model.Unit;
import com.example.xsdPro.model.UnitKey;

public interface UnitMapper {
    int deleteByPrimaryKey(UnitKey key);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(UnitKey key);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}