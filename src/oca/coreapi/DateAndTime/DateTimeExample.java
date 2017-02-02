package oca.coreapi.DateAndTime;

import java.time.*; // import time classes
import java.util.Calendar;  //Old API
import java.util.Date;      //Old API

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
