package com.example.demo.remote;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer")
public interface HelloRemoteTest {

    @RequestMapping(value = "/hello")
    String hello2(@RequestParam(value = "name") String name);

}
