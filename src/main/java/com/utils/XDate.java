package com.utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class XDate {

    public static LocalDate createDate(int day, int month, int year) {
        return LocalDate.of(year, month, day);
    }

    public static LocalDate createDate(String txtDate) { 
        return LocalDate.parse(txtDate);
    }
    
    public static String[] splitTime(String timeString){
        String[] timeSplit = timeString.split(":");
        return timeSplit;
    }

    public static LocalTime createTime(String hour, String minute, String second) {
        int hourInt = Integer.valueOf(hour);
        int minuteInt = Integer.valueOf(minute);
        int secondInt = Integer.valueOf(second);
        return LocalTime.of(hourInt,minuteInt,secondInt);
    }
    
     public static String formatTime(LocalTime time) {
        String timePattern = "HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(timePattern);
        return time.format(formatter);
    }
     
    public static String formatDate(LocalDate date) {
        String datePattern = "dd-MM-uuuu";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(datePattern);
        return date.format(formatter);
    }
}
