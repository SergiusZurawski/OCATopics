package oca.coreapi.DateAndTime;

import java.time.*; // import time classes
/**
    LocalDate -     Contains just a date—no time and no time zone.
    LocalTime -     Contains just a time—no date and no time zone.
    LocalDateTime - Contains both a date and time but no time zone
    ZonedDateTime

    Java uses T to separate the date and time when converting LocalDateTime to a String.
 */
public class DateTimeExample {

    public void timeEx(){
        System.out.println(LocalDate.now());     //2015-01-20
        System.out.println(LocalTime.now());     //12:45:18.401
        System.out.println(LocalDateTime.now()); //2015-01-20T12:45:18.401

    }
}
