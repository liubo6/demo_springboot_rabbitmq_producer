package com.liubo.demo.rabbitmq.producer.person.controller;

import com.liubo.demo.rabbitmq.producer.person.model.PersonDO;
import com.liubo.demo.rabbitmq.producer.person.service.PersonService;
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
}
