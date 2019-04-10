package com.example.xsdPro.dao;

import com.example.xsdPro.model.StockPart;
import com.example.xsdPro.model.StockPartKey;

public interface StockPartMapper {
    int deleteByPrimaryKey(StockPartKey key);

    int insert(StockPart record);

    int insertSelective(StockPart record);

    StockPart selectByPrimaryKey(StockPartKey key);

    int updateByPrimaryKeySelective(StockPart record);

    int updateByPrimaryKey(StockPart record);
}