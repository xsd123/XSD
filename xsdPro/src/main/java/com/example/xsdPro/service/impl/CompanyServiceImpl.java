package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.CompanyMapper;
import com.example.xsdPro.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public Integer selectCompanyCode(String companyCode) {
        return companyMapper.selectCompanyCode(companyCode);
    }
//    // 判断公司代码是否存在
//    public boolean selectCompanyCode(String companyCode) {
//        for (Company user : users) {
//            if (user.getUserCode().equals(username)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
