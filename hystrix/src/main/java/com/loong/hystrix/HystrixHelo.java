package com.loong.hystrix;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HystrixHelo implements HelloRemote {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return name+" there is some thing wrong";
    }
}
