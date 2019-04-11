package com.example.xsdPro.dao;

import com.example.xsdPro.model.StockBus;
import com.example.xsdPro.model.StockBusKey;

public interface StockBusMapper {
    int deleteByPrimaryKey(StockBusKey key);

    int insert(StockBus record);

    int insertSelective(StockBus record);

    StockBus selectByPrimaryKey(StockBusKey key);

    int updateByPrimaryKeySelective(StockBus record);

    int updateByPrimaryKey(StockBus record);
}