package com.example.xsdPro.service;

import com.example.xsdPro.model.Person;

import java.util.List;

public interface PersonService {

    List<Person> selectByCompanyId(Integer companyId,Integer branchId);

    Person selectByPrimaryKey(Integer companyId,Integer branchId,Integer personId);

    Person findALLByPersonId(int personId);
}
