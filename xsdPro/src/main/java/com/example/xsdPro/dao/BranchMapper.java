package com.example.xsdPro.dao;

import com.example.xsdPro.model.Branch;
import com.example.xsdPro.model.BranchKey;

public interface BranchMapper {
    int deleteByPrimaryKey(BranchKey key);

    int insert(Branch record);

    int insertSelective(Branch record);

    Branch selectByPrimaryKey(BranchKey key);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);
}