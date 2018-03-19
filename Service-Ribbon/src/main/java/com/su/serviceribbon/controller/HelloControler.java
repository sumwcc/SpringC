package com.su.serviceribbon.controller;


import com.su.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam String name){
        return helloService.hiService(name);

       // return  "12121";
    }

}
