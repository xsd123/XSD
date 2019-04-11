package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.CompanyMapper;
import com.example.xsdPro.model.Company;
import com.example.xsdPro.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements  CompanyService{

    @Autowired
    private CompanyMapper companyMapper;

    public CompanyMapper getCompanyMapper() {
        return companyMapper;
    }

    public void setCompanyMapper(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }


    @Override
    public Integer selectCompanyCode(String companyCode) {
        return companyMapper.selectCompanyCode(companyCode);
    }

    @Override
    public Company selectByPrimaryKey(Integer id) {
        return companyMapper.selectByPrimaryKey(id);
    }
}
