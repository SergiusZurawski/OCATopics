package oca.bildbloks.FlowControl;

/**
     If no such case statement is found that matches the value, an
     optional default statement will be called. If no such default option is available, the entire
     switch statement will be skipped.

    Variable
    <=java 5.0 only int or promoted (byte, short, char)
    >java 5.0 < 7.0  enum
    >= 7.0  String, wrapper classes, such as Byte, Short, Character, or Integer

    Full list:
     ■ int and Integer
     ■ byte and Byte
     ■ short and Short
     ■ char and Character
     ■ int and Integer
     ■ String
     ■ enum values

    The values in each case statement must be compile-time constant values of the same data type as the switch value.
    use only literals, enum constants, or final constant variables of the same data type.
 */
public class Switch {
    public void swithcExample(){
        int dayOfWeek = 5;
        switch(dayOfWeek) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

        System.out.println("Absense of brake");
        switch(dayOfWeek) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }

        int test_var = 0;
        final int test_const = 0;
        switch(dayOfWeek) {
            //case test_var:   // Constant required, var used
            case test_const:
                System.out.println("constant");
            case 1:
                System.out.println("literal");
            //case 1:            // duplication
            //    System.out.println("case value duplication");
        }

        System.out.println("use enum");
        Day day = Day.MONDAY;
        switch(day) {
            //case test_var:   // Constant required, var used
            case MONDAY:
                System.out.println("enum");
        }

    }
    public enum Day {
        MONDAY (1),
        THURSDAY (2);

        private int dayNumber;
        Day(int dayNumber){
            this.dayNumber = dayNumber;
        }

        public int getDayNumber () {
            return dayNumber;
        }
    }

    private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
            //case middleName: // DOES NOT COMPILE
            //    id = 5;
            //    break;
            case suffix:
                id = 0;
                break;
            //case lastName: // DOES NOT COMPILE
            //    id = 8;
            //    break;
            //case 5: // DOES NOT COMPILE
            //    id = 7;
            //    break;
            //case 'J': // DOES NOT COMPILE
            //   id = 10;
            //    break;
            //case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
            //    id=15;
            //    break;
        }
        return id;
    }

}
