package com.example.xsdPro.dao;

public interface CompanyMapper {
    /*int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);*/

    Integer selectCompanyCode(String companyCode);
}