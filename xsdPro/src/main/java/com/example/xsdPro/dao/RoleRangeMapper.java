package com.example.xsdPro.dao;

import com.example.xsdPro.model.RoleRange;
import com.example.xsdPro.model.RoleRangeKey;

public interface RoleRangeMapper {
    int deleteByPrimaryKey(RoleRangeKey key);

    int insert(RoleRange record);

    int insertSelective(RoleRange record);

    RoleRange selectByPrimaryKey(RoleRangeKey key);

    int updateByPrimaryKeySelective(RoleRange record);

    int updateByPrimaryKey(RoleRange record);
}