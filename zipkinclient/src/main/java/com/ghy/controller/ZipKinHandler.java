package com.ghy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("zipkin")
public class ZipKinHandler {
    @Value("${server.port}")
    private String port;

    @RequestMapping("index")
    public String index(){
        return this.port;
    }
}
