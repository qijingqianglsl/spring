package com.qjq.service.impl;

import com.qjq.mapper.PersonMapper;
import com.qjq.pojo.Person;
import com.qjq.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package: com.qjq.service.impl
 * <p>
 * Description： TODO
 * <p>
 * Author: qjq
 * <p>
 * Date: Created in 2019/6/19 0019 20:33
 * <p>
 * Company: neiquan
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonMapper personMapper;
    @Override
    public void personAdd(Person person) {
        personMapper.personAdd(person);

    }
}
