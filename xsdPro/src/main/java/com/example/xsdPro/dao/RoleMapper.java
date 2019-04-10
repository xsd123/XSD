package com.example.xsdPro.dao;

import com.example.xsdPro.model.Role;
import com.example.xsdPro.model.RoleKey;

public interface RoleMapper {
    int deleteByPrimaryKey(RoleKey key);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(RoleKey key);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    Role findAllByRoleId(int roleId);
}