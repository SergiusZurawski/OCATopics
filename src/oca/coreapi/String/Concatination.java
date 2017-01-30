package oca.coreapi.String;

/**
 */
public class Concatination {
    String name0 = "Fluffy";
    String name1 = new String("Fluffy");

    /**concatenation
     1. If both operands are numeric, + means numeric addition.
     2. If either operand is a String, + means concatenation.
     3. The expression is evaluated left to right.
     */
    String concatenation = "1" + "2"; //"12"
    public void concatenationExample(){
        System.out.println(1 + 2); // 3
        System.out.println("a" + "b"); // ab
        System.out.println("a" + "b" + 3); // ab3
        System.out.println(1 + 2 + "c"); // 3c

        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); //64

        String s = "1"; // s currently holds "1"
        s += "2"; // s currently holds "12"
        s += 3; // s currently holds "123"
        System.out.println(s); // 123

        //Concat method
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2);  //12

    }
}
