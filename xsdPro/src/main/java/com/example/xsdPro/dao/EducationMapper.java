package com.example.xsdPro.dao;

import com.example.xsdPro.model.Education;
import com.example.xsdPro.model.EducationKey;

public interface EducationMapper {
    int deleteByPrimaryKey(EducationKey key);

    int insert(Education record);

    int insertSelective(Education record);

    Education selectByPrimaryKey(EducationKey key);

    int updateByPrimaryKeySelective(Education record);

    int updateByPrimaryKey(Education record);
}