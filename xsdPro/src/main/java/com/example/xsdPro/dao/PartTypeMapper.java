package com.example.xsdPro.dao;

import com.example.xsdPro.model.PartType;
import com.example.xsdPro.model.PartTypeExample;
import com.example.xsdPro.model.PartTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartTypeMapper {
    int countByExample(PartTypeExample example);

    int deleteByPrimaryKey(PartTypeKey key);

    int insert(PartType record);

    int insertSelective(PartType record);

    List<PartType> selectByExample(PartTypeExample example);

    PartType selectByPrimaryKey(PartTypeKey key);

    int updateByExampleSelective(@Param("record") PartType record, @Param("example") PartTypeExample example);

    int updateByExample(@Param("record") PartType record, @Param("example") PartTypeExample example);

    int updateByPrimaryKeySelective(PartType record);

    int updateByPrimaryKey(PartType record);
}