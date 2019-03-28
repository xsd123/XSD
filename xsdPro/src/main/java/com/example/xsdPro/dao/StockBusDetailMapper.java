package com.example.xsdPro.dao;

import com.example.xsdPro.model.StockBusDetail;
import com.example.xsdPro.model.StockBusDetailExample;
import com.example.xsdPro.model.StockBusDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockBusDetailMapper {
    int countByExample(StockBusDetailExample example);

    int deleteByPrimaryKey(StockBusDetailKey key);

    int insert(StockBusDetail record);

    int insertSelective(StockBusDetail record);

    List<StockBusDetail> selectByExample(StockBusDetailExample example);

    StockBusDetail selectByPrimaryKey(StockBusDetailKey key);

    int updateByExampleSelective(@Param("record") StockBusDetail record, @Param("example") StockBusDetailExample example);

    int updateByExample(@Param("record") StockBusDetail record, @Param("example") StockBusDetailExample example);

    int updateByPrimaryKeySelective(StockBusDetail record);

    int updateByPrimaryKey(StockBusDetail record);
}