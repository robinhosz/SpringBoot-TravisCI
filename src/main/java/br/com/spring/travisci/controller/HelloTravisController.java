package br.com.spring.travisci.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloTravisController {


    @GetMapping("/travis")
    public String hello() {
        return "Hello Travis";
    }
}
