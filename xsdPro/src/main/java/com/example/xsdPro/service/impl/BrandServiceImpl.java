package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.BrandMapper;
import com.example.xsdPro.model.Brand;
import com.example.xsdPro.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandServiceImpl  implements BrandService {

    @Autowired
    private BrandMapper brandMapper;
    public BrandMapper getBrandMapper() {
        return brandMapper;
    }

    public void setBrandMapper(BrandMapper brandMapper) {
        this.brandMapper = brandMapper;
    }

    @Override
    public List<Brand> selectByCompanyId(Integer companyid) {
        return brandMapper.selectByCompanyId(companyid);
    }

    @Override
    public Brand selectByPrimaryBrandId(Integer companyId, Integer brandId) {
        return brandMapper.selectByPrimaryBrandId(companyId,brandId);
    }
}
