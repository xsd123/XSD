package com.example.xsdPro.dao;

import com.example.xsdPro.model.Part;
import com.example.xsdPro.model.PartExample;
import com.example.xsdPro.model.PartKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartMapper {
    int countByExample(PartExample example);

    int deleteByPrimaryKey(PartKey key);

    int insert(Part record);

    int insertSelective(Part record);

    List<Part> selectByExample(PartExample example);

    Part selectByPrimaryKey(PartKey key);

    int updateByExampleSelective(@Param("record") Part record, @Param("example") PartExample example);

    int updateByExample(@Param("record") Part record, @Param("example") PartExample example);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
}