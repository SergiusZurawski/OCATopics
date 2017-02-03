package oca.coreapi.DateAndTime;

import java.time.*; // import time classes
import java.util.Calendar;  //Old API
import java.util.Date;      //Old API

import java.time.*; // import time classes New API
import java.util.*; // Old API

import static java.time.temporal.ChronoField.MINUTE_OF_HOUR;

/**
    LocalDate -     Contains just a date—no time and no time zone.
    LocalTime -     Contains just a time—no date and no time zone.
    LocalDateTime - Contains both a date and time but no time zone
    ZonedDateTime

    Date and time classes are immutable

    Java uses T to separate the date and time when converting LocalDateTime to a String.
    All constructors are private, use only static methods.
    Month Index 1 based
 */
public class DateTimeExample {

    public void timeEx(){
        System.out.println(LocalDate.now());     //2015-01-20
        System.out.println(LocalTime.now());     //12:45:18.401
        System.out.println(LocalDateTime.now()); //2015-01-20T12:45:18.401
    }

    /**
     public static LocalDate of(int year, int month, int dayOfMonth)
     public static LocalDate of(int year, Month month, int dayOfMonth)
     */
    public void dateExample(){
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);
    }

    /**
        public static LocalTime of(int hour, int minute)
        public static LocalTime of(int hour, int minute, int second)
        public static LocalTime of(int hour, int minute, int second, int nanos)
     */

    public void timeExample(){
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds
    }

    /**
     public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
     public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
     public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
     public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
     public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
     public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
     public static LocalDateTime of(LocalDate date, LocalTime)
     */

    public void dateTimeExample(){
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);

        //From objects
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
    }

    public void exception(){
        //Call constructor directly
        //LocalDate d = new LocalDate(); // DOES NOT COMPILE

        //invalid number(Too big)
        LocalDate.of(2015, Month.JANUARY, 32); // throws DateTimeException
    }

    /**Date Time
        Java 1.1
            Month Index 0 based
            There wasn’t a way to specify just a date without the time
        Java 1.2
            Calendar
                                                            Old way                                 New way (Java 8 and later)
     Importing import                                       java.util.*;                            import java.time.*;
     Creating an object with the current date               Date d = new Date();                    LocalDate d = LocalDate.now();
     Creating an object with the current date and time      Date d = new Date();                    LocalDateTime dt = LocalDateTime.now();
     */

    public void creatingSpecificDate(){
        //Creating Jan 1 2015
        //Old Calendar Way
        Calendar c = Calendar.getInstance();
        c.set(2015, Calendar. JANUARY, 1);
        Date jan = c.getTime();
        System.out.println(jan);

        //Old Calendar Way #2
        Calendar c2 = new GregorianCalendar(2015, Calendar.JANUARY, 1);
        Date jan2 = c2.getTime();
        System.out.println(jan);

        //New Date API
        LocalDate jan3 = LocalDate.of(2015, Month.JANUARY, 1);

        //Without Month enum
        // Old API
        Calendar c3 = Calendar.getInstance();
        c.set(2015, 0, 1);
        Date jan4 = c.getTime();
        // New API
        LocalDate jan5 = LocalDate.of(2015, 1, 1);
    }

    public void addingDates(){
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
        System.out.println(date); // 2014-01-20
        date = date.plusDays(2);
        System.out.println(date); // 2014-01-22
        date = date.plusWeeks(1);
        System.out.println(date); // 2014-01-29
        date = date.plusMonths(1);
        System.out.println(date); // 2014-02-28
        date = date.plusYears(5);
        System.out.println(date); // 2019-02-28
    }

    public void substructingDate(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime); // 2020-01-20T05:15
        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime); // 2020-01-19T05:15
        dateTime = dateTime.minusHours(10);
        System.out.println(dateTime); // 2020-01-18T19:15
        dateTime = dateTime.minusSeconds(30);
        System.out.println(dateTime); // 2020-01-18T19:14:30
    }

    public void dateChaning(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time)
                .minusDays(1).minusHours(10).minusSeconds(30);
    }

    public void dataTimeIsImmutable(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        date.plusDays(10);
        System.out.println(date);
    }

    public void exceptions(){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        //date = date.plusMinutes(1); // DOES NOT COMPILE
    }

    public void methodsOsLocalDate(){
        LocalDate lD = LocalDate.of(2020, 1, 1);

        lD.plusYears(1);
        lD.minusYears(1);

        lD.plusMonths(1);
        lD.minusMonths(1);

        lD.plusWeeks(1);
        lD.minusWeeks(1);

        lD.minusWeeks(1);
        lD.minusWeeks(1);

    }


    /**
                                Can call on LocalDate?    Can call on LocalTime?   Can call on LocalDateTime?
     plusYears/minusYears               Yes                 No                      Yes
     plusMonths/minusMonths             Yes                 No                      Yes
     plusWeeks/minusWeeks               Yes                 No                      Yes
     plusDays/minusDays                 Yes                 No                      Yes
     plusHours/minusHours               No                  Yes                     Yes
     plusMinutes/minusMinutes           No                  Yes                     Yes
     plusSeconds/minusSeconds           No                  Yes                     Yes
     plusNanos/minusNanos               No                  Yes                     Yes
     */

    public Date addDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }
    public LocalDate addDay(LocalDate date) {
        return date.plusDays(1);
    }

    public Date subtractDay(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }
    public LocalDate subtractDay(LocalDate date) {
        return date.minusDays(1);
    }

    // Periods

    public void periodsExample(){
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }

    private void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) { // check if still before end
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1); // add a month
        }
    }

    public void convertToLong(){
        LocalDate ld = LocalDate.of(2099, Month.APRIL, 1);
        System.out.println(ld.toEpochDay());
        LocalDateTime ldt = LocalDateTime.of(2999, Month.AUGUST, 1, 1, 1);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        System.out.println(ldt.toEpochSecond(zoneOffset));
    }

    public void periodExample() {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1); // create a period
        performPeriodCalculation(start, end, period);
    }
    private void performPeriodCalculation(LocalDate start, LocalDate end, Period period) { // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period); // adds the period
        }
    }

    /**  Period for a day and more

         Period annually = Period.ofYears(1);           // every 1 year
         Period quarterly = Period.ofMonths(3);         // every 3 months
         Period everyThreeWeeks = Period.ofWeeks(3);    // every 3 weeks
         Period everyOtherDay = Period.ofDays(2);       // every 2 days
         Period everyYearAndAWeek = Period.of(1, 0, 7); // every year and 7 days

        You CANNOT chain periods
     */
    public void periodTrick(){
        Period wrong0 = Period.ofYears(1).ofWeeks(1); // every week
        //the same as
        Period wrong  = Period.ofYears(1);
        wrong = Period.ofWeeks(7);
    }

    /** Duration for smaller Units
        can specify the number of days, hours, minutes, seconds, or nanoseconds.

     */

    public void periodExampleAdvanced(){
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);
        System.out.println(date.plus(period)); // 2015-02-20
        System.out.println(dateTime.plus(period)); // 2015-02-20T06:15
        System.out.println(time.plus(period)); // UnsupportedTemporalTypeException
    }
}
