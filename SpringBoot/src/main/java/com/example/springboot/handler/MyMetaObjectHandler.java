package com.example.springboot.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

//记得加入容器中
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime",timestamp,metaObject);
        this.setFieldValByName("updateTime",timestamp,metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",timestamp,metaObject);
    }
}
