package oca.coreapi.DateAndTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/** DateTimeFormatter
 */
public class FormattingDates {
    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
    LocalTime time = LocalTime.of(11, 12, 34);
    LocalDateTime dateTime = LocalDateTime.of(date, time);

    public void gettingDataOutofDate(){
        System.out.println(date.getDayOfWeek()); // MONDAY
        System.out.println(date.getMonth());     // JANUARY
        System.out.println(date.getYear());      // 2020
        System.out.println(date.getDayOfYear()); // 20
    }

    public void dateFormatterExample(){
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }

    public void shortDateFormatterExample(){

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime)); // 1/20/20
        System.out.println(shortDateTime.format(date)); // 1/20/20
        System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException
    }

    public void shortDateFormatterExample2(){
        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(dateTime.format(shortDateTime));
        System.out.println(date.format(shortDateTime));
        System.out.println(time.format(shortDateTime));
    }

    /**
     DateTimeFormatter f = DateTimeFormatter._____(FormatStyle.SHORT);
                                Calling f.format(localDate)   Calling f.format(localDateTime)   Calling f.format(localTime)
     ofLocalizedDate            Legal – shows whole object    Legal – shows just date part      Throws runtime exception
     ofLocalizedDateTime        Throws runtime exception      Legal – shows whole object        Throws runtime exception
     ofLocalizedTime            Throws runtime exception      Legal – shows just time part      Legal – shows whole object
     */

    /**
     List of predefined formats
     SHORT
     MEDIUM
     ...
     */

    public void predefinedFormats(){
        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime)); // 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime)); // Jan 20, 2020 11:12:34 AM
    }

    public void ownFormat(){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(f)); // January 20, 2020, 11:12
    }
}
