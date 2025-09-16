package com.example.DateTime.controller;

import com.example.DateTime.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class WeatherController {

    private WeatherService weatherService;

    //Construction injection
    public WeatherController (WeatherService weatherService){
        this.weatherService = weatherService;
    }
    @GetMapping("/weather/temperature")
    public int GetTemperature(){
        return weatherService.getCurrentTemperature();
    }
    @GetMapping("/weather/condition")
    public String GetCondition(){
        return weatherService.getWeatherCondition();
    }
    @GetMapping ("/weather/windspeed")
    public int GetWindSpeed(){
        return weatherService.getWindSpeed();
    }
//    @GetMapping ("/weather/all")
//    public Map<String, Object> GetAllWeather(){
//        return Map.of(
//                "temperature ", weatherService.getCurrentTemperature(),
//                "condition ", weatherService.getWeatherCondition(),
//                "wind speed", weatherService.GetWindSpeed()
//        );
    @GetMapping ("/weather/all")
    Map<String, Object> getAllWeather() {
        Map<String, Object> weatherMap = new HashMap<>();
        weatherMap.put("temperature", weatherService.getCurrentTemperature());
        weatherMap.put("condition", weatherService.getWeatherCondition());
        weatherMap.put("windspeed", weatherService.getWindSpeed());
        return weatherMap;
    }





    }

