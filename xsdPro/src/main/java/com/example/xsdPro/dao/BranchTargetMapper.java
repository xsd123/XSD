package com.example.xsdPro.dao;

import com.example.xsdPro.model.BranchTarget;
import com.example.xsdPro.model.BranchTargetKey;

public interface BranchTargetMapper {
    int deleteByPrimaryKey(BranchTargetKey key);

    int insert(BranchTarget record);

    int insertSelective(BranchTarget record);

    BranchTarget selectByPrimaryKey(BranchTargetKey key);

    int updateByPrimaryKeySelective(BranchTarget record);

    int updateByPrimaryKey(BranchTarget record);
}