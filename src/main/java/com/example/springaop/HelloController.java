package com.example.springaop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@Slf4j
public class HelloController {
    @RequestMapping(value = "/")
    public String index() {
        return "Greeting from Spring AOP";
    }
}
