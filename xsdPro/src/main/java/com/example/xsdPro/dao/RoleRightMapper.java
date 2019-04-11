package com.example.xsdPro.dao;

import com.example.xsdPro.model.RoleRight;
import com.example.xsdPro.model.RoleRightKey;

import java.util.List;

public interface RoleRightMapper {
    int deleteByPrimaryKey(RoleRightKey key);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(RoleRightKey key);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);

    List<RoleRight> findAllByRoleId(int roleId);
}