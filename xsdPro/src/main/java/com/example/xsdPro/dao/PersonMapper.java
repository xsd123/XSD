package com.example.xsdPro.dao;

import com.example.xsdPro.model.Person;

import org.apache.ibatis.annotations.Param;



import java.util.List;

public interface PersonMapper {
    List<Person> selectByCompanyId(@Param("companyId") Integer companyId,@Param("branchId") Integer branchId);

    Person selectByPrimaryKey(@Param("companyId") Integer companyId,@Param("branchId") Integer branchId,@Param("personId") Integer personId);

    Person findALLByPersonId(int personId);

}