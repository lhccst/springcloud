package com.lhc.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @auther lhc
 * @create 2021-8-5
 * @Decription nacos服务消费者controller
 * */
@RestController
public class Order83Controller {
    @Autowired
    private RestTemplate restTemplate;

    //自动注入，与配置分离
    //根据服务名称获取服务提供者的 并调用方法
    @Value("${server-url.nacos-order-service}")
    private String SERVER_URL;

    /**
     * @Decription 根据服务名称获取服务提供者的端口号，测试负载均衡
     * */
    @GetMapping("/consumer/payment/nacos/{id}")
    public String getServer(@PathVariable("id") Long id) {
        return restTemplate.getForObject(SERVER_URL + "/payment/nacos/" + id,String.class);
    }
}
