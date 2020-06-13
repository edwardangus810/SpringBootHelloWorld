package com.example.springboothelloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理请求Contrlooer
 */
@RestController  // @Controller+@ResponsBody  直接返回字符串
public class HelloWorldController {

    //@RequestMapping("/helloWorld")
    @GetMapping("/helloWorld")
    public String showHelloWorld() {
        return "HelloWorld";
    }
}
