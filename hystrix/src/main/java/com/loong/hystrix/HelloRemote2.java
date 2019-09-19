package com.loong.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(name="eureka-client")
public interface HelloRemote2 {
    @RequestMapping(value = "/hello")
    @HystrixCommand(fallbackMethod = "wrong")
    public String hello(@RequestParam(value = "name") String name);
//    public String wrong( String name){
//        return name+" there is some thing wrong from HelloRemote2";
//    }
}
