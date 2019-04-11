package com.example.xsdPro.dao;
import com.example.xsdPro.model.Company;
public interface CompanyMapper {
    Company selectByPrimaryKey(Integer id);

    Integer selectCompanyCode(String companyCode);
}