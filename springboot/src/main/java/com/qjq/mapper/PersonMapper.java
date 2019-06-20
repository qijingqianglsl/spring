package com.qjq.mapper;

import com.qjq.pojo.Person;
import org.apache.ibatis.annotations.Mapper;

/**
 * Package: com.qjq.mapper
 * <p>
 * Description： TODO
 * <p>
 * Author: qjq
 * <p>
 * Date: Created in 2019/6/19 0019 20:30
 * <p>
 * Company: neiquan
 * <p>
 * Copyright: Copyright (c) 2017
 * <p>
 * Version: 0.0.1
 */
@Mapper
public interface PersonMapper {
    /**
     * 添加一个人的数据信息
     * @param person
     */
    void personAdd(Person person);

}
