package com.example.xsdPro.dao;

import com.example.xsdPro.model.StockPart;
import com.example.xsdPro.model.StockPartExample;
import com.example.xsdPro.model.StockPartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockPartMapper {
    int countByExample(StockPartExample example);

    int deleteByPrimaryKey(StockPartKey key);

    int insert(StockPart record);

    int insertSelective(StockPart record);

    List<StockPart> selectByExample(StockPartExample example);

    StockPart selectByPrimaryKey(StockPartKey key);

    int updateByExampleSelective(@Param("record") StockPart record, @Param("example") StockPartExample example);

    int updateByExample(@Param("record") StockPart record, @Param("example") StockPartExample example);

    int updateByPrimaryKeySelective(StockPart record);

    int updateByPrimaryKey(StockPart record);
}