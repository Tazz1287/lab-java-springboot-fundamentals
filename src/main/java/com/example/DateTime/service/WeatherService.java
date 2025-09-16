package com.example.DateTime.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class WeatherService {

    private Random random = new Random();

    public int getCurrentTemperature() {
        return random.nextInt(51) -10;
    }
    public String getWeatherCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy" };
        return conditions[random.nextInt(conditions.length)];
    }

    public int getWindSpeed() {
        return random.nextInt(101);
    }


    }


