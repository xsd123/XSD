package com.example.xsdPro.dao;

import com.example.xsdPro.model.RolePerson;
import com.example.xsdPro.model.RolePersonKey;
import com.example.xsdPro.model.vo.RolePersonVo;

import java.util.List;

public interface RolePersonMapper {
    int deleteByPrimaryKey(RolePersonKey key);

    int insert(RolePerson record);

    int insertSelective(RolePerson record);

    RolePerson selectByPrimaryKey(RolePersonKey key);

    int updateByPrimaryKeySelective(RolePerson record);

    int updateByPrimaryKey(RolePerson record);

    List<RolePersonVo> findRolePersonByUserCode(String userCode);
}