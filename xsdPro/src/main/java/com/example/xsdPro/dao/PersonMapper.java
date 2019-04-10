package com.example.xsdPro.dao;

import com.example.xsdPro.model.Person;
<<<<<<< HEAD
import org.apache.ibatis.annotations.Param;
=======
import com.example.xsdPro.model.PersonKey;
>>>>>>> liyi

import java.util.List;

public interface PersonMapper {
<<<<<<< HEAD
   /* int countByExample(PersonExample example);

=======
>>>>>>> liyi
    int deleteByPrimaryKey(PersonKey key);

    int insert(Person record);

    int insertSelective(Person record);

<<<<<<< HEAD
    List<Person> selectByExample(PersonExample example);*/

    List<Person> selectByCompanyId(@Param("companyId") Integer companyId,@Param("branchId") Integer branchId);

    Person selectByPrimaryKey(@Param("companyId") Integer companyId,@Param("branchId") Integer branchId,@Param("personId") Integer personId);
    /*
    int updateByExampleSelective(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByExample(@Param("record") Person record, @Param("example") PersonExample example);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);*/
=======
    Person selectByPrimaryKey(PersonKey key);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    Person findALLByPersonId(int personId);
>>>>>>> liyi
}