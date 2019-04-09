package com.example.xsdPro.dao;

import com.example.xsdPro.model.Brand;
import com.example.xsdPro.model.BrandExample;
import com.example.xsdPro.model.BrandKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    List<Brand> selectByCompanyId(Integer companyId);

    Brand selectByPrimaryBrandId(Integer companyId,Integer brandId);

    int countByExample(BrandExample example);

    int deleteByPrimaryKey(BrandKey key);

    int insert(Brand record);

    int insertSelective(Brand record);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(BrandKey key);

    int updateByExampleSelective(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByExample(@Param("record") Brand record, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}