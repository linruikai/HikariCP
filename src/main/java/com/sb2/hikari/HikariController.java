package com.sb2.hikari;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruikai.lin  on 2018/5/10 下午5:15.
 * Email: ruikai.lin@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@RestController
public class HikariController {

    private static final Logger logger = LoggerFactory.getLogger(HikariController.class);

    @Autowired
    private UserMapper userMapper;

    @GetMapping("id")
    public String get(Integer id){
        String name = userMapper.get(id);
        logger.info("name  {}",name);
        return name;
    }
}
