package com.samplefullstack.samplefullstack.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/greet")
@CrossOrigin("*") //allow all connections
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
