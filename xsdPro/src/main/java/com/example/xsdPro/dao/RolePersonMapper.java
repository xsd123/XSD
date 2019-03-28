package com.example.xsdPro.dao;

import com.example.xsdPro.model.RolePerson;
import com.example.xsdPro.model.RolePersonExample;
import com.example.xsdPro.model.RolePersonKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolePersonMapper {
    int countByExample(RolePersonExample example);

    int deleteByPrimaryKey(RolePersonKey key);

    int insert(RolePerson record);

    int insertSelective(RolePerson record);

    List<RolePerson> selectByExample(RolePersonExample example);

    RolePerson selectByPrimaryKey(RolePersonKey key);

    int updateByExampleSelective(@Param("record") RolePerson record, @Param("example") RolePersonExample example);

    int updateByExample(@Param("record") RolePerson record, @Param("example") RolePersonExample example);

    int updateByPrimaryKeySelective(RolePerson record);

    int updateByPrimaryKey(RolePerson record);
}