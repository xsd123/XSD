package com.example.xsdPro.dao;

import com.example.xsdPro.model.DicRegion;
import com.example.xsdPro.model.DicRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicRegionMapper {
    int countByExample(DicRegionExample example);

    int insert(DicRegion record);

    int insertSelective(DicRegion record);

    List<DicRegion> selectByExample(DicRegionExample example);

    int updateByExampleSelective(@Param("record") DicRegion record, @Param("example") DicRegionExample example);

    int updateByExample(@Param("record") DicRegion record, @Param("example") DicRegionExample example);
}