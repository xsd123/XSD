package com.example.xsdPro.service;

import com.example.xsdPro.model.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> selectByCompanyId(Integer companyid);

    Brand selectByPrimaryBrandId(Integer companyId,Integer brandId);
}
