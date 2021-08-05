package com.lhc.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lhc
 * @cerate 2021-8-5
 * @Decription Json封装体
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;

    private CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
