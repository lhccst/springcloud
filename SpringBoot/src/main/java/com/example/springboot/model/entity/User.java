package com.example.springboot.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class User {
    @TableId(type =IdType.AUTO)
    private int id;
    private String username;
    private String password;
    private double balance;

    //要为他们编写处理器
    //填充策略为插入时更新
    @TableField(fill = FieldFill.INSERT)
    private Timestamp createTime;
    //填充策略为插入更新时更新
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Timestamp updateTime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
