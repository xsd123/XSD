package com.example.xsdPro.dao;

import com.example.xsdPro.model.Brand;
import com.example.xsdPro.model.BrandKey;

public interface BrandMapper {
<<<<<<< HEAD
    List<Brand> selectByCompanyId(Integer companyId);

    Brand selectByPrimaryBrandId(Integer companyId,Integer brandId);

    int countByExample(BrandExample example);

=======
>>>>>>> liyi
    int deleteByPrimaryKey(BrandKey key);

    int insert(Brand record);

    int insertSelective(Brand record);

    Brand selectByPrimaryKey(BrandKey key);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);
}