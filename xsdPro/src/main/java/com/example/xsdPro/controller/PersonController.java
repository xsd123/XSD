package com.example.xsdPro.controller;

import com.example.xsdPro.model.Person;
import com.example.xsdPro.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonServiceImpl personService;

    public PersonServiceImpl getPersonService() {
        return personService;
    }

    public void setPersonService(PersonServiceImpl personService) {
        this.personService = personService;
    }

}
