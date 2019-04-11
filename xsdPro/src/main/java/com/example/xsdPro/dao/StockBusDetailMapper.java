package com.example.xsdPro.dao;

import com.example.xsdPro.model.StockBusDetail;
import com.example.xsdPro.model.StockBusDetailKey;

public interface StockBusDetailMapper {
    int deleteByPrimaryKey(StockBusDetailKey key);

    int insert(StockBusDetail record);

    int insertSelective(StockBusDetail record);

    StockBusDetail selectByPrimaryKey(StockBusDetailKey key);

    int updateByPrimaryKeySelective(StockBusDetail record);

    int updateByPrimaryKey(StockBusDetail record);
}