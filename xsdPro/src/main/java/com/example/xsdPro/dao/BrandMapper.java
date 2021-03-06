package com.example.xsdPro.dao;

import com.example.xsdPro.model.Brand;
import com.example.xsdPro.model.BrandKey;

import java.util.List;

public interface BrandMapper {

    List<Brand> selectByCompanyId(Integer companyId);

    Brand selectByPrimaryBrandId(Integer companyId,Integer brandId);

    int deleteByPrimaryKey(BrandKey key);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(BrandKey key);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}