package com.example.xsdPro.dao;

import com.example.xsdPro.model.StoreHouse;
import com.example.xsdPro.model.StoreHouseExample;
import com.example.xsdPro.model.StoreHouseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreHouseMapper {
    int countByExample(StoreHouseExample example);

    int deleteByPrimaryKey(StoreHouseKey key);

    int insert(StoreHouse record);

    int insertSelective(StoreHouse record);

    List<StoreHouse> selectByExample(StoreHouseExample example);

    StoreHouse selectByPrimaryKey(StoreHouseKey key);

    int updateByExampleSelective(@Param("record") StoreHouse record, @Param("example") StoreHouseExample example);

    int updateByExample(@Param("record") StoreHouse record, @Param("example") StoreHouseExample example);

    int updateByPrimaryKeySelective(StoreHouse record);

    int updateByPrimaryKey(StoreHouse record);
}