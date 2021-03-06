package com.liubo.demo.rabbitmq.producer.person.controller;

import com.liubo.demo.rabbitmq.person.model.PersonDO;
import com.liubo.demo.rabbitmq.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzlbo on 2016/7/4.
 */
@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public boolean addPerson(@RequestBody PersonDO personDO) throws Exception {
        for (int i = 0; i < 1000; i++) {
                personService.addPerson(personDO);
        }


        return personService.addPerson(personDO);
    }

    @RequestMapping(value = "/test")
    public String StringMsg(String test) throws Exception {

        return "ok";
    }
}
