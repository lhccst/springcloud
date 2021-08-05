package com.lhc.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther lhc
 * @create 2021-8-5
 */
@EnableDiscoveryClient
@SpringBootApplication

public class PaymentMain9001
{
    public static void main(String[] args) {

        SpringApplication.run(PaymentMain9001.class, args);
    }
}
