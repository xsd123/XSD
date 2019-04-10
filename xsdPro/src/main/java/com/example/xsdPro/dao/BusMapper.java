package com.example.xsdPro.dao;

import com.example.xsdPro.model.Bus;
import com.example.xsdPro.model.BusKey;

public interface BusMapper {
    int deleteByPrimaryKey(BusKey key);

    int insert(Bus record);

    int insertSelective(Bus record);

    Bus selectByPrimaryKey(BusKey key);

    int updateByPrimaryKeySelective(Bus record);

    int updateByPrimaryKey(Bus record);
}