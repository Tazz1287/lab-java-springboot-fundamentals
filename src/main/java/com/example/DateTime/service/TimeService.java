package com.example.DateTime.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.StringJoiner;


@Service
public class TimeService {

    public String getCurrentTime() {
        return  LocalTime.now().toString();
    }
    public String getCurrentDate(){
        return LocalDate.now().toString();
    }


    public String getCurrentDay(){
        return LocalDate.now()
        .getDayOfWeek()
        .getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
    public Map<String, String> getAll(){
        Map <String, String> response = new HashMap<>();
        response.put("currentTime", getCurrentTime());
        response.put("currentDate", getCurrentDate());
        response.put("currentDay", getCurrentDay());
        return response;
    }

}
