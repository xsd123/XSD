package com.example.xsdPro.dao;

import com.example.xsdPro.model.Branch;
import com.example.xsdPro.model.BranchExample;
import com.example.xsdPro.model.BranchKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchMapper {
    int countByExample(BranchExample example);

    int deleteByPrimaryKey(BranchKey key);

    int insert(Branch record);

    int insertSelective(Branch record);

    List<Branch> selectByExample(BranchExample example);

    Branch selectByPrimaryKey(BranchKey key);

    int updateByExampleSelective(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByExample(@Param("record") Branch record, @Param("example") BranchExample example);

    int updateByPrimaryKeySelective(Branch record);

    int updateByPrimaryKey(Branch record);
}