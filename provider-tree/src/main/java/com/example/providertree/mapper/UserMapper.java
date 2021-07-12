package com.example.providertree.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.providertree.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
