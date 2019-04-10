package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.CompanyMapper;
<<<<<<< HEAD
import com.example.xsdPro.model.Company;
import com.example.xsdPro.service.ICompanyService;
=======
import com.example.xsdPro.service.CompanyService;
>>>>>>> liyi
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
<<<<<<< HEAD
public class CompanyServiceImpl implements  ICompanyService{

    @Autowired
    private CompanyMapper companyMapper;

    public CompanyMapper getCompanyMapper() {
        return companyMapper;
    }

    public void setCompanyMapper(CompanyMapper companyMapper) {
        this.companyMapper = companyMapper;
    }

    @Override
    public Company selectByPrimaryKey(Integer id) {
        return companyMapper.selectByPrimaryKey(id);
    }


=======
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
>>>>>>> liyi
}
