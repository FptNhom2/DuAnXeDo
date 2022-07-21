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

    public static LocalTime createTime(int hour, int minute, int second) {
        return LocalTime.of(hour,minute,second);
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
