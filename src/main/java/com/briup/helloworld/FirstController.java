package com.briup.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/helloworld")//通过这个跳转网页
    public String hello(){
        return "西装配玫瑰，美女一大堆";
    }
}
