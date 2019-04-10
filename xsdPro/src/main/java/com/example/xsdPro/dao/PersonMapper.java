package com.example.xsdPro.dao;

import com.example.xsdPro.model.Person;
import com.example.xsdPro.model.PersonKey;

public interface PersonMapper {
    int deleteByPrimaryKey(PersonKey key);

    int insert(Person record);

    int insertSelective(Person record);

    Person selectByPrimaryKey(PersonKey key);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    Person findALLByPersonId(int personId);
}