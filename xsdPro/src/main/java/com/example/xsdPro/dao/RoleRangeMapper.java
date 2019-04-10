package com.example.xsdPro.dao;

import com.example.xsdPro.model.RoleRange;
import com.example.xsdPro.model.RoleRangeExample;
import com.example.xsdPro.model.RoleRangeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleRangeMapper {
    int countByExample(RoleRangeExample example);

    int deleteByPrimaryKey(RoleRangeKey key);

    int insert(RoleRange record);

    int insertSelective(RoleRange record);

    List<RoleRange> selectByExample(RoleRangeExample example);

    RoleRange selectByPrimaryKey(RoleRangeKey key);

    int updateByExampleSelective(@Param("record") RoleRange record, @Param("example") RoleRangeExample example);

    int updateByExample(@Param("record") RoleRange record, @Param("example") RoleRangeExample example);

    int updateByPrimaryKeySelective(RoleRange record);

    int updateByPrimaryKey(RoleRange record);
}