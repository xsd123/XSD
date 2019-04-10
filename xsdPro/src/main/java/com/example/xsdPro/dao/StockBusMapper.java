package com.example.xsdPro.dao;

import com.example.xsdPro.model.StockBus;
import com.example.xsdPro.model.StockBusExample;
import com.example.xsdPro.model.StockBusKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockBusMapper {
    int countByExample(StockBusExample example);

    int deleteByPrimaryKey(StockBusKey key);

    int insert(StockBus record);

    int insertSelective(StockBus record);

    List<StockBus> selectByExample(StockBusExample example);

    StockBus selectByPrimaryKey(StockBusKey key);

    int updateByExampleSelective(@Param("record") StockBus record, @Param("example") StockBusExample example);

    int updateByExample(@Param("record") StockBus record, @Param("example") StockBusExample example);

    int updateByPrimaryKeySelective(StockBus record);

    int updateByPrimaryKey(StockBus record);
}