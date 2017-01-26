package oca.bildbloks.FlowControl;

public class IFStatment {
    public void examples(){
        int hourOfDay = 0;
        int morningGreetingCount = 0;

        // without braces ; can be only one statment
        if(hourOfDay < 11)
            System.out.println("Good Morning");

        // with braces
        if(hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }

        // example. morningGreetingCount will be incrementet always
        if(hourOfDay < 11)
            System.out.println("Good Morning");
            morningGreetingCount++;
        morningGreetingCount++;

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        if(hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }
}
