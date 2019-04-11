package com.example.xsdPro.service;

import com.example.xsdPro.model.Company;

public interface CompanyService {
    Integer selectCompanyCode(String companyCode) ;
    /**
     *
     * @param id
     * @return 按id查询公司信息
     */
    Company selectByPrimaryKey(Integer id);
}
