package com.yyww.demo.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yyww.demo.provider.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
