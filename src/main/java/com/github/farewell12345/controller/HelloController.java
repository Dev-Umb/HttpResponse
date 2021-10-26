package com.github.farewell12345.controller;

import com.github.farewell12345.result.Response;
import com.github.farewell12345.result.ResponseFactoryImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public Response<String> hello(){
        return ResponseFactoryImpl.build().success("Ok","hello!");
    }
}

