package com.example.providertree.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.providertree.entity.User;
import com.example.providertree.mapper.UserMapper;
import com.example.providertree.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
