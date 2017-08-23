package com.test.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){

        return "Hello world !";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){

        return "Hello SpringBoot !";

    }

}
