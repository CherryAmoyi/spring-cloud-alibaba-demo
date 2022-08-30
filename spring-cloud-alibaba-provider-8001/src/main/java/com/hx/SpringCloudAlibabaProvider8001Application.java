package com.hx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author huxiao
 * @description com.hx.SpringCloudAlibabaProvider8001Application
 * @date 2022/8/23 15:08
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudAlibabaProvider8001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAlibabaProvider8001Application.class, args);
    }
}
