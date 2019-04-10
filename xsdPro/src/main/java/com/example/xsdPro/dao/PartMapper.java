package com.example.xsdPro.dao;

import com.example.xsdPro.model.Part;
import com.example.xsdPro.model.PartKey;

public interface PartMapper {
    int deleteByPrimaryKey(PartKey key);

    int insert(Part record);

    int insertSelective(Part record);

    Part selectByPrimaryKey(PartKey key);

    int updateByPrimaryKeySelective(Part record);

    int updateByPrimaryKey(Part record);
}