package com.sb2.hikari;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by ruikai.lin  on 2018/5/10 下午5:16.
 * Email: ruikai.lin@plusx.cn
 * Copyright (c) 2014 承影互联(科技)有限公司 版权所有
 */
@Mapper
public interface UserMapper {

    @Select("select name from user where id = #{id}")
    String get(Integer id);
}
