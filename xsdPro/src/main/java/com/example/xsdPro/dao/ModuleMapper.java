package com.example.xsdPro.dao;

import com.example.xsdPro.model.Module;

public interface ModuleMapper {
   /* int deleteByPrimaryKey(Integer id);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);*/

    Module findAllByModuleId(int moduleId);
}