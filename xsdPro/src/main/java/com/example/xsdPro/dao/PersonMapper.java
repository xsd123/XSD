package com.example.xsdPro.dao;

import com.example.xsdPro.model.Person;
import com.example.xsdPro.model.PersonExample;
import com.example.xsdPro.model.PersonKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {
    int countByExample(PersonExample example);

    int deleteByPrimaryKey(PersonKey key);

    int insert(Person record);

    int insertSelective(Person record);

    List<Person> selectByExample(PersonExample example);

    Person selectByPrimaryKey(PersonKey key);

    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);
}