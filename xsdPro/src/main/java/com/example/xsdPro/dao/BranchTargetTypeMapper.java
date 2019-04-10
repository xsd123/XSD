package com.example.xsdPro.dao;

import com.example.xsdPro.model.BranchTargetType;
import com.example.xsdPro.model.BranchTargetTypeKey;

public interface BranchTargetTypeMapper {
    int deleteByPrimaryKey(BranchTargetTypeKey key);

    int insert(BranchTargetType record);

    int insertSelective(BranchTargetType record);

    BranchTargetType selectByPrimaryKey(BranchTargetTypeKey key);

    int updateByPrimaryKeySelective(BranchTargetType record);

    int updateByPrimaryKey(BranchTargetType record);
}