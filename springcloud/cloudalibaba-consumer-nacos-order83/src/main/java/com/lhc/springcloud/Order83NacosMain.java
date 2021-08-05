package com.lhc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther lhc
 * @create 2021-8-5
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Order83NacosMain {
    public static void main(String[] args) {
        SpringApplication.run(Order83NacosMain.class, args);
    }
}

