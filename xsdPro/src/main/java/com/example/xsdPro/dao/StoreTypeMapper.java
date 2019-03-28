package com.example.xsdPro.dao;

import com.example.xsdPro.model.StoreType;
import com.example.xsdPro.model.StoreTypeExample;
import com.example.xsdPro.model.StoreTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreTypeMapper {
    int countByExample(StoreTypeExample example);

    int deleteByPrimaryKey(StoreTypeKey key);

    int insert(StoreType record);

    int insertSelective(StoreType record);

    List<StoreType> selectByExample(StoreTypeExample example);

    StoreType selectByPrimaryKey(StoreTypeKey key);

    int updateByExampleSelective(@Param("record") StoreType record, @Param("example") StoreTypeExample example);

    int updateByExample(@Param("record") StoreType record, @Param("example") StoreTypeExample example);

    int updateByPrimaryKeySelective(StoreType record);

    int updateByPrimaryKey(StoreType record);
}