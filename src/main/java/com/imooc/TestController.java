package com.imooc;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    @GetMapping("/")
    private String get1(){
        return "some thing";
    }

    @GetMapping("/2")
    private Mono<String> get2(){
        return Mono.just("some thing");
    }

}
