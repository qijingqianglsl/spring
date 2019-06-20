package com.qjq.controller;

import com.qjq.pojo.Person;
import com.qjq.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Package: com.qjq.controller
 * <p>
 * Description： TODO
 * <p>
 * Author: qjq
 * <p>
 * Date: Created in 2019/6/19 0019 20:35
 * <p>
 * Company: neiquan
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 */
@Controller
public class Mytest {
    @Autowired
    private PersonService personService;
    //跳转到添加人员的页面
    @RequestMapping(value = "/toaddperson")
    public String toAddPersonJsp(){
        return "person_add";
    }
    //进行添加人员操作
    @RequestMapping(value = "/addperson")
    public String addPersonOption(Person person){
        personService.personAdd(person);
        return "person_add";

    }
}
