package com.liubo.demo.rabbitmq.producer.person.service.impl;

import com.liubo.demo.rabbitmq.producer.AmqpConfig;
import com.liubo.demo.rabbitmq.producer.person.model.PersonDO;
import com.liubo.demo.rabbitmq.producer.person.service.PersonService;
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
    public String addPerson(PersonDO personDO) throws Exception {
        Assert.notNull(personDO, "添加对象信息不能为空");
        Assert.hasText(personDO.getId(), "添加对象信息ID 不能为空");
        Assert.hasText(personDO.getUserId(), "添加对象信息用户编号不能为空");
        Assert.notNull(personDO.getAge(), "添加对象信息年龄不能为空");
        Message message = buildMessage(personDO);
        template.convertAndSend(AmqpConfig.EXCHANGE,AmqpConfig.ROUTINGKEY,message);
        return "OK";
    }

    private Message buildMessage(PersonDO personDO) throws Exception {
        Message message = MessageBuilder.withBody(personDO.toString().getBytes())
                .setMessageId(UUID.randomUUID().toString()).build();
        return message;
    }

    /**
     * 修改信息
     *
     * @param personDO
     * @return
     * @throws Exception
     */
    @Override
    public boolean modifyPerson(PersonDO personDO) throws Exception {
        return false;
    }

    /**
     * 删除信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public boolean removePerson(String id) throws Exception {
        return false;
    }

    /**
     * 根据ID 获取
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public PersonDO getPersonById(String id) throws Exception {
        return null;
    }

    /**
     * 根据条件获取
     *
     * @param personDO
     * @return
     * @throws Exception
     */
    @Override
    public List<PersonDO> queryPersonList(PersonDO personDO) throws Exception {
        return null;
    }
}
