package com.liubo.demo.rabbitmq.producer.person.service;

import com.liubo.demo.rabbitmq.producer.person.model.PersonDO;

import java.util.List;

/**
 * Created by hzlbo on 2016/7/4.
 */
public interface PersonService {


    /**
     * 增加用户
     *
     * @param personDO
     * @return
     * @throws Exception
     */
    public String addPerson(PersonDO personDO) throws Exception;

    /**
     * 修改信息
     *
     * @param personDO
     * @return
     * @throws Exception
     */
    public boolean modifyPerson(PersonDO personDO) throws Exception;

    /**
     * 删除信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    public boolean removePerson(String id) throws Exception;

    /**
     * 根据ID 获取
     *
     * @param id
     * @return
     * @throws Exception
     */
    public PersonDO getPersonById(String id) throws Exception;

    /**
     * 根据条件获取
     *
     * @param personDO
     * @return
     * @throws Exception
     */
    public List<PersonDO> queryPersonList(PersonDO personDO) throws Exception;


}
