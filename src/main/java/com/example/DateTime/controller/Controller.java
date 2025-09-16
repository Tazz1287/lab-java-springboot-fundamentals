package com.example.DateTime.controller;

import com.example.DateTime.service.TimeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Controller {
    private final TimeService service;

    public Controller(TimeService service) {
        this.service = service;
    }
    @GetMapping("/time")
    public String getTime() {
        return service.getCurrentTime();
    }
    @GetMapping("/date")
    public String getDate() {
        return service.getCurrentDate();
    }
    @GetMapping("/day")
    public String getDay() {
        return service.getCurrentDay();
    }
    @GetMapping("/all")
    public String getAll() {
        return service.getAll().toString();
    }

}
