package com.example.xsdPro.dao;

import com.example.xsdPro.model.BranchTarget;
import com.example.xsdPro.model.BranchTargetExample;
import com.example.xsdPro.model.BranchTargetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchTargetMapper {
    int countByExample(BranchTargetExample example);

    int deleteByPrimaryKey(BranchTargetKey key);

    int insert(BranchTarget record);

    int insertSelective(BranchTarget record);

    List<BranchTarget> selectByExample(BranchTargetExample example);

    BranchTarget selectByPrimaryKey(BranchTargetKey key);

    int updateByExampleSelective(@Param("record") BranchTarget record, @Param("example") BranchTargetExample example);

    int updateByExample(@Param("record") BranchTarget record, @Param("example") BranchTargetExample example);

    int updateByPrimaryKeySelective(BranchTarget record);

    int updateByPrimaryKey(BranchTarget record);
}