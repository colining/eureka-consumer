package com.example.demo.web;

import com.example.demo.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloRemote helloRemote;

    @Autowired
    ConsumerService consumerService;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }

    @RequestMapping("/hello1/{name}")
    public String name(@PathVariable("name") String name){
        return consumerService.consumer(name);
    }
}