package com.lxk.wc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 项目名称：wc
 * 类名称：PersonController
 * 类描述：
 * 创建人：lxk
 * 创建时间：2019-03-27 15:49
 * 修改人：
 * 修改时间：
 * 修改备注：
 **/
@RestController
public class PersonController {


    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String getPolice(){
        //RestTemplate rt = restTemplate();
        String result = restTemplate.getForObject("http://eureka-client/client", String.class);
        return result;
    }
}
