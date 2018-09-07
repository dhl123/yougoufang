package com.youzufang.youzufang;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellobootController {
    @RequestMapping("helloBoot")
    public String helloBoot(){
        return "Hello Boot-JPA";
    }
}