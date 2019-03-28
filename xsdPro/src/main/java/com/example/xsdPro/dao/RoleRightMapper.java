package com.example.xsdPro.dao;

import com.example.xsdPro.model.RoleRight;
import com.example.xsdPro.model.RoleRightExample;
import com.example.xsdPro.model.RoleRightKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleRightMapper {
    int countByExample(RoleRightExample example);

    int deleteByPrimaryKey(RoleRightKey key);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    List<RoleRight> selectByExample(RoleRightExample example);

    RoleRight selectByPrimaryKey(RoleRightKey key);

    int updateByExampleSelective(@Param("record") RoleRight record, @Param("example") RoleRightExample example);

    int updateByExample(@Param("record") RoleRight record, @Param("example") RoleRightExample example);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}