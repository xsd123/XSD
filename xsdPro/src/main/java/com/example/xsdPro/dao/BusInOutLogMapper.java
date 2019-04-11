package com.example.xsdPro.dao;

import com.example.xsdPro.model.BusInOutLog;
import com.example.xsdPro.model.BusInOutLogKey;

public interface BusInOutLogMapper {
    int deleteByPrimaryKey(BusInOutLogKey key);

    int insert(BusInOutLog record);

    int insertSelective(BusInOutLog record);

    BusInOutLog selectByPrimaryKey(BusInOutLogKey key);

    int updateByPrimaryKeySelective(BusInOutLog record);

    int updateByPrimaryKey(BusInOutLog record);
}