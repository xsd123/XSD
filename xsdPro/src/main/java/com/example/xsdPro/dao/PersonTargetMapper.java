package com.example.xsdPro.dao;

import com.example.xsdPro.model.PersonTarget;
import com.example.xsdPro.model.PersonTargetExample;
import com.example.xsdPro.model.PersonTargetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonTargetMapper {
    int countByExample(PersonTargetExample example);

    int deleteByPrimaryKey(PersonTargetKey key);

    int insert(PersonTarget record);

    int insertSelective(PersonTarget record);

    List<PersonTarget> selectByExample(PersonTargetExample example);

    PersonTarget selectByPrimaryKey(PersonTargetKey key);

    int updateByExampleSelective(@Param("record") PersonTarget record, @Param("example") PersonTargetExample example);

    int updateByExample(@Param("record") PersonTarget record, @Param("example") PersonTargetExample example);

    int updateByPrimaryKeySelective(PersonTarget record);

    int updateByPrimaryKey(PersonTarget record);
}