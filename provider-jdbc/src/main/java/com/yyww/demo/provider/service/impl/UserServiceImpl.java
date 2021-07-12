package com.yyww.demo.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yyww.demo.provider.entity.User;
import com.yyww.demo.provider.mapper.UserMapper;
import com.yyww.demo.provider.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
