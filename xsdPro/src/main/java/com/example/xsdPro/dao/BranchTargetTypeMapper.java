package com.example.xsdPro.dao;

import com.example.xsdPro.model.BranchTargetType;
import com.example.xsdPro.model.BranchTargetTypeExample;
import com.example.xsdPro.model.BranchTargetTypeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BranchTargetTypeMapper {
    int countByExample(BranchTargetTypeExample example);

    int deleteByPrimaryKey(BranchTargetTypeKey key);

    int insert(BranchTargetType record);

    int insertSelective(BranchTargetType record);

    List<BranchTargetType> selectByExample(BranchTargetTypeExample example);

    BranchTargetType selectByPrimaryKey(BranchTargetTypeKey key);

    int updateByExampleSelective(@Param("record") BranchTargetType record, @Param("example") BranchTargetTypeExample example);

    int updateByExample(@Param("record") BranchTargetType record, @Param("example") BranchTargetTypeExample example);

    int updateByPrimaryKeySelective(BranchTargetType record);

    int updateByPrimaryKey(BranchTargetType record);
}