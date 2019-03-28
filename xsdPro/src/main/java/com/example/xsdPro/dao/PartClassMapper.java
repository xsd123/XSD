package com.example.xsdPro.dao;

import com.example.xsdPro.model.PartClass;
import com.example.xsdPro.model.PartClassExample;
import com.example.xsdPro.model.PartClassKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PartClassMapper {
    int countByExample(PartClassExample example);

    int deleteByPrimaryKey(PartClassKey key);

    int insert(PartClass record);

    int insertSelective(PartClass record);

    List<PartClass> selectByExample(PartClassExample example);

    PartClass selectByPrimaryKey(PartClassKey key);

    int updateByExampleSelective(@Param("record") PartClass record, @Param("example") PartClassExample example);

    int updateByExample(@Param("record") PartClass record, @Param("example") PartClassExample example);

    int updateByPrimaryKeySelective(PartClass record);

    int updateByPrimaryKey(PartClass record);
}