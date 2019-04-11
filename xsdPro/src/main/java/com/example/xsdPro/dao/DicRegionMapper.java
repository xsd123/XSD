package com.example.xsdPro.dao;

import com.example.xsdPro.model.DicRegion;

public interface DicRegionMapper {
    int insert(DicRegion record);

    int insertSelective(DicRegion record);
}