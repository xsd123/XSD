package com.example.xsdPro.dao;

import com.example.xsdPro.model.Education;
import com.example.xsdPro.model.EducationExample;
import com.example.xsdPro.model.EducationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationMapper {
    int countByExample(EducationExample example);

    int deleteByPrimaryKey(EducationKey key);

    int insert(Education record);

    int insertSelective(Education record);

    List<Education> selectByExample(EducationExample example);

    Education selectByPrimaryKey(EducationKey key);

    int updateByExampleSelective(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByExample(@Param("record") Education record, @Param("example") EducationExample example);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}