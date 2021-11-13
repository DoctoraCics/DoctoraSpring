package com.samplefullstack.samplefullstack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("/api/v1/greet")
public class Greet
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "hello world";

    }
    @RequestMapping("/hi")
    public String hi()
    {
        return "hi";
    }
}
