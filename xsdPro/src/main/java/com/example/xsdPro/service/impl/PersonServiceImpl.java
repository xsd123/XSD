package com.example.xsdPro.service.impl;

import com.example.xsdPro.dao.PersonMapper;
import com.example.xsdPro.model.Person;
import com.example.xsdPro.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;

    public PersonMapper getPersonMapper() {
        return personMapper;
    }

    public void setPersonMapper(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    @Override
    public Person findALLByPersonId(int personId) {
        return personMapper.findALLByPersonId(personId);
    }
}
