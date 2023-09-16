package top.meethigher.jmeter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/{a}/{b}")
    public Integer test(@PathVariable("a") Integer a,@PathVariable("b") Integer b) {
        return a+b;
    }
}
