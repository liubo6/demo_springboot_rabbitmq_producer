package com.liubo.demo.rabbitmq.producer.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzlbo on 2016/7/4.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/add")
    public String addPerson(PersonDO personDO) throws Exception {

        return personService.addPerson(personDO);
    }

    @RequestMapping(value = "/test")
    public String StringMsg(String test) throws Exception {

        return "ok";
    }
}
