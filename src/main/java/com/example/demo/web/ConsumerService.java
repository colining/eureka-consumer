package com.example.demo.web;

import com.example.demo.remote.HelloRemoteTest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class ConsumerService {


    @Autowired
    HelloRemoteTest helloRemoteTest;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer(String name) {
        return helloRemoteTest.hello2(name);
    }

    public String fallback(String name) {
        return "fallback "+name;
    }

}

