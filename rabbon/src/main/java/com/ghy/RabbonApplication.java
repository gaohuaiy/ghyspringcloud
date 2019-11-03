package com.ghy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RabbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RabbonApplication.class,args);
    }
    @Bean
    @LoadBalanced
    //@LoadBalanced 负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
