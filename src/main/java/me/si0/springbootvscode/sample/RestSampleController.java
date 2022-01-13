package me.si0.springbootvscode.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestSampleController {
    @GetMapping("/hello")
    public String hello(){
        return "hello vs code";
    }
}
