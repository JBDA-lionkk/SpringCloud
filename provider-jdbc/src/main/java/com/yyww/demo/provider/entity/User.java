package com.yyww.demo.provider.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@TableName("users")
public class User {
    private Integer id;
    private String username;
    private String password;
}
