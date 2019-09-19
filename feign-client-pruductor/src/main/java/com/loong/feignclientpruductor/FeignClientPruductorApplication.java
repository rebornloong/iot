package com.loong.feignclientpruductor;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@EnableEurekaClient
public class FeignClientPruductorApplication {

    public static void main(String[] args) {

        SpringApplication.run(FeignClientPruductorApplication.class, args);
    }

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient eureakCLient;


    @RequestMapping("/hello")
    public String index(@RequestParam String name) {
        return "hello "+name+"，this is sencond messge";
    }
}

