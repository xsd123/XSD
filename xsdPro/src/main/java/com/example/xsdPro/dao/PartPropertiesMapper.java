package com.example.xsdPro.dao;

import com.example.xsdPro.model.PartProperties;
import com.example.xsdPro.model.PartPropertiesExample;
import com.example.xsdPro.model.PartPropertiesKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartPropertiesMapper {
    int countByExample(PartPropertiesExample example);

    int deleteByPrimaryKey(PartPropertiesKey key);

    int insert(PartProperties record);

    int insertSelective(PartProperties record);

    List<PartProperties> selectByExample(PartPropertiesExample example);

    PartProperties selectByPrimaryKey(PartPropertiesKey key);

    int updateByExampleSelective(@Param("record") PartProperties record, @Param("example") PartPropertiesExample example);

    int updateByExample(@Param("record") PartProperties record, @Param("example") PartPropertiesExample example);

    int updateByPrimaryKeySelective(PartProperties record);

    int updateByPrimaryKey(PartProperties record);
}