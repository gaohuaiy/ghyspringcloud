package com.ghy.feign.impl;

import com.ghy.entity.Student;
import com.ghy.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中！！！";
    }
}
