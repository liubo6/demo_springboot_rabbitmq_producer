package com.liubo.demo.rabbitmq.producer.person.service.impl;

import com.liubo.demo.rabbitmq.person.model.PersonDO;
import com.liubo.demo.rabbitmq.person.service.PersonService;
import com.liubo.demo.rabbitmq.producer.AmqpConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.UUID;

/**
 * Created by hzlbo on 2016/7/4.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private RabbitTemplate template;

    /**
     * 增加用户
     *
     * @param personDO
     * @return
     * @throws Exception
     */
    @Override
    public boolean addPerson(PersonDO personDO) throws Exception {
        Assert.notNull(personDO, "添加对象信息不能为空");
        Assert.hasText(personDO.getId(), "添加对象信息ID 不能为空");
        Assert.hasText(personDO.getUserId(), "添加对象信息用户编号不能为空");
        Assert.notNull(personDO.getAge(), "添加对象信息年龄不能为空");

        template.convertAndSend(AmqpConfig.EXCHANGE, AmqpConfig.ROUTINGKEY, personDO);
        return true;
    }

    private Message buildMessage(PersonDO personDO) throws Exception {
        Message message = MessageBuilder.withBody(personDO.toString().getBytes())
                .setMessageId(UUID.randomUUID().toString()).setContentType("application/json").build();
        return message;
    }

    @Override
    public boolean removePerson(String s) throws Exception {
        return false;
    }

    @Override
    public boolean modifyPerson(PersonDO personDO) throws Exception {
        return false;
    }

    @Override
    public PersonDO getPerson(String s) throws Exception {
        return null;
    }

    @Override
    public List<PersonDO> queryPersonList(PersonDO personDO) throws Exception {
        return null;
    }
}
