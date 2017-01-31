package oca.coreapi.String;

/**
    never use == to compare String objects
 */
public class Equality {
    public void understandingEquality(){
        java.lang.StringBuilder one = new java.lang.StringBuilder();
        java.lang.StringBuilder two = new java.lang.StringBuilder();
        java.lang.StringBuilder three = one.append("a");
        System.out.println(one == two); // false
        System.out.println(one == three); // true
    }

    public void stringEquallity(){
        String x = "Hello World";
        String y = "Hello World";
        System.out.println(x == y); // true

        String z = " Hello World".trim();
        System.out.println(x == z); // false

        String a = new String("Hello World");
        System.out.println(x == a); // false
        System.out.println(x.equals(a)); // true
    }
}
