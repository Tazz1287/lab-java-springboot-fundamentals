package com.example.DateTime.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "Hello " + name + "!";
    }
    @GetMapping("/add/{num1}/{num2}")
    public String add(@PathVariable int num1, @PathVariable int num2) {
        int sum = num1 + num2;
        return "Sum : " + sum;
    }
    @GetMapping("/multiply/{num1}/{num2}")
    public String multiply(@PathVariable int num1, @PathVariable int num2) {
        int product = num1 * num2;
        return "Product : " + product;
    }
}
