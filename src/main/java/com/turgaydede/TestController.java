package com.turgaydede;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "Hello world.";
    }
}
