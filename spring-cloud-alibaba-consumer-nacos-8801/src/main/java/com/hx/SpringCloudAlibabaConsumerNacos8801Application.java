package com.hx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author huxiao
 * @description SpringCloudAlibabaConsumerNacos8801Application
 * @date 2022/8/23 16:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaConsumerNacos8801Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaConsumerNacos8801Application.class, args);
    }
}
