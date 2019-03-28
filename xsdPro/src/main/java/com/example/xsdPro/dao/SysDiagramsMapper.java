package com.example.xsdPro.dao;

import com.example.xsdPro.model.SysDiagrams;

public interface SysDiagramsMapper {
    int deleteByPrimaryKey(Integer diagramId);

    int insert(SysDiagrams record);

    int insertSelective(SysDiagrams record);

    SysDiagrams selectByPrimaryKey(Integer diagramId);

    int updateByPrimaryKeySelective(SysDiagrams record);

    int updateByPrimaryKeyWithBLOBs(SysDiagrams record);

    int updateByPrimaryKey(SysDiagrams record);
}