package com.example.providertree.controller;

import com.example.providertree.entity.User;
import com.example.providertree.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@RestController
@RequestMapping("/add")
public class UserController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private UserService userService;

    @RequestMapping("/userAll")
    public void userAll(HttpServletResponse response) throws IOException {
        List<User> users = userService.list();
        for (User user : users) {
            PrintWriter writer = response.getWriter();
            writer.write(user + serverPort);
        }
    }
}
